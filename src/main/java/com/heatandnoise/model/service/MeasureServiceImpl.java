package com.heatandnoise.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heatandnoise.model.dao.IMeasureDao;
import com.heatandnoise.model.entity.Measure;

@Service
public class MeasureServiceImpl implements IMeasureService {
	
	@Autowired
	private IMeasureDao measureDao;

	@Override
	@Transactional(readOnly = true)
	public List<Measure> findAll() {
		return (List<Measure>) measureDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Measure findOne(Long id) {
		return measureDao.findById(id).orElse(null);
	}

	@Override
	public List<Measure> findBySensor(String sensorId) {
		return measureDao.findBySensorId(sensorId);
	}
	
	@Override
	public Measure saveMesure(Measure measure) {
		return measureDao.save(measure);
	}

}
