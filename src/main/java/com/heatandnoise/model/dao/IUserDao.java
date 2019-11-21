package com.heatandnoise.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heatandnoise.model.entity.User;

public interface IUserDao extends JpaRepository<User, Long>{

}
