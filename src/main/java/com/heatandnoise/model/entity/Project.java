package com.heatandnoise.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="projects")
public class Project implements Serializable{

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectId;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE )
	private Date createAt;
	
	@OneToMany(mappedBy = "projectId", fetch = FetchType.LAZY)
	private List<Sensor> Sensors;
	
	@Column
	private boolean active;
	
//	public Long getProjectId() {
//		return projectId;
//	}
//
//	public void setgetProjectId(Long projectId) {
//		this.projectId = projectId;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Sensor> getSensors() {
		return Sensors;
	}

	public void setSensors(List<Sensor> sensors) {
		Sensors = sensors;
	}

	@Override
	public String toString() {
		return "Project [projectId=" +  ", name=" + name + ", description=" + description + ", createAt="
				+ createAt + ", Sensors=" + Sensors + ", active=" + active + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
