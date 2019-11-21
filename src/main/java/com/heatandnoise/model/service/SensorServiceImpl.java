package com.heatandnoise.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heatandnoise.model.dao.ISensorDao;
import com.heatandnoise.model.entity.Sensor;

@Service
public class SensorServiceImpl implements ISensorService {
	
	@Autowired
	private ISensorDao sensorDao;

	@Override
	@Transactional(readOnly = true)
	public List<Sensor> findAll() {
		return (List<Sensor>) sensorDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Sensor findOne(String sensorId) {
		return sensorDao.findBySensorId(sensorId);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Sensor> findByProjectId(Long id) {
		return sensorDao.findByProjectId(id);
	}
	
	@Override
	@Transactional
	public Sensor createSensor(Sensor sensor) {
		return sensorDao.save(sensor);
	}

}
