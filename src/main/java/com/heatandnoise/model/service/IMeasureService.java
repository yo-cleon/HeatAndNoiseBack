package com.heatandnoise.model.service;

import java.util.List;

import com.heatandnoise.model.entity.Measure;


public interface IMeasureService {
	
	public List<Measure> findAll();
	
	public Measure findOne(Long id);
	
	public List<Measure> findBySensor(String sensorId);
	
	public Measure saveMesure(Measure measure);

}
