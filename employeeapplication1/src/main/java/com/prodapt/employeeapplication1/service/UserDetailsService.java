package com.prodapt.employeeapplication1.service;

import java.util.List;

import com.prodapt.employeeapplication1.entity.UserDetails;


public interface UserDetailsService {
	
	//Create
	public UserDetails addUser(UserDetails userDetails);
	//Retrieve
	public UserDetails getUserById(Long id);
	
	//Update
	public UserDetails updateUser(UserDetails userDetails);
	
	//Delete
	public void deleteUserById(Long id);
	
	//retrive userslist
	public List<UserDetails> getUsersList();

}
