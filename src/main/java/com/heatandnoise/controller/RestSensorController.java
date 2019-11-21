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

import com.heatandnoise.model.entity.Sensor;
import com.heatandnoise.model.service.ISensorService;

@RestController
@RequestMapping("/api/sensors")
public class RestSensorController {
	
	@Autowired
	private ISensorService sensorService;
	
	@GetMapping("")
	public List<Sensor> getSensors(){
		return sensorService.findAll();
	}
	
	@GetMapping("/{sensorId}")
	public Sensor getOneSensor(@PathVariable String sensorId){
		return sensorService.findOne(sensorId);
	}
	
	@GetMapping("/byProject/{id}")
	public List<Sensor> getSensorsByProject(@PathVariable Long id){
		return sensorService.findByProjectId(id);
	}
	
	@GetMapping("/bySensor/{id}")
	public Sensor getSensorsById(@PathVariable String id){
		Sensor sensor = new Sensor();
		sensor = sensorService.findOne(id);
		System.out.println(sensor.toString());
		return sensorService.findOne(id);
	}
	
	@PostMapping("")
	@ResponseStatus(code = HttpStatus.CREATED )
	public Sensor createSensor(@RequestBody Sensor sensor) {
		return sensorService.createSensor(sensor);
	}

}
