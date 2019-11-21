package com.heatandnoise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.heatandnoise.model.entity.Measure;
import com.heatandnoise.model.service.IMeasureService;

@RestController
@RequestMapping("/api/measures")
public class RestMeasureController {
	
	@Autowired
	private IMeasureService measureService;
	
	@GetMapping("")
	public List<Measure> getMeasures() {
		return measureService.findAll();
	}

	@GetMapping("/{id}")
	public Measure getMeasureById(@PathVariable Long id) {
		return measureService.findOne(id);
	}
	
	@GetMapping("bySensor/{sensorId}")
	public List<Measure> getMeasureBySensor(@PathVariable String sensorId){
		return measureService.findBySensor(sensorId);
	}
	
	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Measure createMeasure(@RequestBody Measure measure) {
		System.out.println(measure.toString());
		return measureService.saveMesure(measure);
	}
}
