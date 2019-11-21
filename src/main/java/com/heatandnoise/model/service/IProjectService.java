package com.heatandnoise.model.service;

import java.util.List;


import com.heatandnoise.model.entity.Project;

public interface IProjectService {
	
	public List<Project> findAll();
	
	public Project findOne(Long id);
	
	public List<Project> findActiveProjects();

	public Project createProject(Project project);
	
}
