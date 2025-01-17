package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

	public User findById(int id);
	
}
