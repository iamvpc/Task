package com.prodapt.employeeapplication1.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.prodapt.employeeapplication1.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository <Role, Long> {

}
