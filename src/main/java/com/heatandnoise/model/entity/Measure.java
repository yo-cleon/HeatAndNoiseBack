package com.heatandnoise.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "measures")
public class Measure implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "sensor_id")
	private String sensor_id;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date taken;
	
	@Column
	private double temperature;
	
	@Column
	private int humidity;
	
	@Column
	private int decibels;
	
	
	public Measure() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSensor_id() {
		return sensor_id;
	}

	public void setSensor_id(String sensor_id) {
		this.sensor_id = sensor_id;
	}

	public Date getTaken() {
		return taken;
	}

	public void setTaken(Date taken) {
		this.taken = taken;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getDecibels() {
		return decibels;
	}

	public void setDecibels(int decibels) {
		this.decibels = decibels;
	}

	@Override
	public String toString() {
		return "Measure [id=" + id + ", taken=" + taken + ", temperature=" + temperature + ", humidity=" + humidity
				+ ", decibels=" + decibels + "]";
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
