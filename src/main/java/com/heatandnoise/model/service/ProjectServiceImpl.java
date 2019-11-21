package com.heatandnoise.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heatandnoise.model.dao.IProjectDao;
import com.heatandnoise.model.entity.Project;

@Service
public class ProjectServiceImpl implements IProjectService{

	@Autowired
	private IProjectDao projectDao;

	@Override
	public List<Project> findActiveProjects() {
		return projectDao.findByActive();
	}
	
	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return (List<Project>) projectDao.findAll();
	}

	@Override
	public Project findOne(Long id) {
		return projectDao.findById(id).orElse(null);
	}
	
	@Override
	public Project createProject(Project project) {
		// TODO Auto-generated method stub
		return projectDao.save(project);
	}


}
