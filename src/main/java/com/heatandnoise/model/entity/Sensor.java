package com.heatandnoise.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="sensors")
public class Sensor implements Serializable {

	@Id
	@Column(name = "sensor_id")
	private String sensorId;
	
	@Column
	private String name;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date added;
	
	@Column(name = "project_id")
	private Long projectId;
	
	@Column
	@OneToMany(mappedBy = "sensor_id")
	private List<Measure> measures; 
	
	public Sensor() {
		
	}

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}
	
	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public List<Measure> getMeasures() {
		return measures;
	}

	public void setMeasures(List<Measure> measures) {
		this.measures = measures;
	}

	@Override
	public String toString() {
		return "Sensor [sensorId=" + sensorId + ", name=" + name + ", added=" + added + ", projectId=" + projectId
				+ ", measures=" + measures + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
