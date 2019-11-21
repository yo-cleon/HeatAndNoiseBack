package com.heatandnoise.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.heatandnoise.model.entity.Project;

public interface IProjectDao extends CrudRepository<Project, Long> {
	
	@Query("select p FROM Project p where active = true")
	public List<Project> findByActive();

}
