package com.prodapt.employeeapplication1.service;

import com.prodapt.employeeapplication1.entity.User;

import com.prodapt.employeeapplication1.exception.InvalidCredentialsException;



public interface UserService {
	//Create
			public User addUser(User user);
			//Retrieve
			public User getUserByName(String userName);
			
			//Update
			public User updateUser(User user);
			
			//Delete
			public void deleteUserById(Long id);
			
			//Login
			public User loginUser(User user) throws InvalidCredentialsException;

}
