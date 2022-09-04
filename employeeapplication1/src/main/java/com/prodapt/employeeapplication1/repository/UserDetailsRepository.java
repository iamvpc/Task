package com.prodapt.employeeapplication1.repository;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.prodapt.employeeapplication1.entity.User;
import com.prodapt.employeeapplication1.entity.UserDetails;


@Repository

public interface UserDetailsRepository extends CrudRepository<UserDetails, Long>  {

	User findByEmail(String email);
}
