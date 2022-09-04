package com.prodapt.employeeapplication1.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;



import com.prodapt.employeeapplication1.entity.User;
@Repository
public interface UserRepository  extends CrudRepository<User, Long> {
	
	User findByUserName(String userName);

}
