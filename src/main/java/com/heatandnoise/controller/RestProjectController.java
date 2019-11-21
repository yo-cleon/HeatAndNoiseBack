package com.heatandnoise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.heatandnoise.model.entity.Project;
import com.heatandnoise.model.service.IProjectService;

@RestController()
@RequestMapping("/api")
public class RestProjectController {
	
	@Autowired
	private IProjectService projectService;
	
	@GetMapping("/projects")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Project> getActiveProjects(){
		return projectService.findActiveProjects();
	}
	
	@GetMapping("allProjects")
	public List<Project> getProjects(){
		return projectService.findAll();
	}
	
	@GetMapping("/{id}")
	public Project getProjectById(@PathVariable Long id){
		Project project = new Project();
		project = projectService.findOne(id);
		System.out.println(project.toString());
		return project;
	}
	
	

}
