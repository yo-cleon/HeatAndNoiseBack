package com.heatandnoise.model.service;

import java.util.List;

import com.heatandnoise.model.entity.User;

public interface IUserService {
	
	public User findOne(Long id);
	
	public List<User> findAll();
	
	public void deleteUser(User user);
	
	public User createUser(User user);

}
