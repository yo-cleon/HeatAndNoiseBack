package com.heatandnoise.model.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.heatandnoise.model.entity.Sensor;

public interface ISensorDao extends CrudRepository<Sensor, String> {
	
	public List<Sensor> findByProjectId(Long id);
	
	public Sensor findBySensorId(String sensorId);

}
