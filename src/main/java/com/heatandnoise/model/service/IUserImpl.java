package com.heatandnoise.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.heatandnoise.model.dao.IUserDao;
import com.heatandnoise.model.entity.User;

@Service
public class IUserImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	@ResponseStatus(code = HttpStatus.FOUND)
	public User findOne(Long id) {
		return userDao.findById(id).orElse(null);
	}

	@Override
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public void deleteUser(@RequestBody User user) {
		userDao.delete(user);
	}

	@Override
	@ResponseStatus(code = HttpStatus.CREATED)
	public User createUser(@RequestBody User user) {
		return userDao.save(user);
	}

}
