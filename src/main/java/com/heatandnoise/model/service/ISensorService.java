package com.heatandnoise.model.service;

import java.util.List;

import com.heatandnoise.model.entity.Sensor;

public interface ISensorService {
	
	public List<Sensor> findAll();
	
	public List<Sensor> findByProjectId(Long id);
	
	public Sensor findOne(String sensorId);
	
	public Sensor createSensor(Sensor sensor);
	

}
