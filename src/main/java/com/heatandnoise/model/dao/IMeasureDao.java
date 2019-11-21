package com.heatandnoise.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.heatandnoise.model.entity.Measure;


public interface IMeasureDao extends JpaRepository<Measure, Long>{
	
	@Query("From Measure where sensor_id = ?1")
	public List<Measure> findBySensorId(String sensorId);
	

}
