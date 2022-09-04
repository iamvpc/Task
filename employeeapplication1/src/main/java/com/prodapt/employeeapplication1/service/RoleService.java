package com.prodapt.employeeapplication1.service;

import com.prodapt.employeeapplication1.entity.Role;

public interface RoleService {
	//Create
		public Role addRole(Role role);
		//Retrieve
		public Role getRoleById(Long id);
		
		//Update
		public Role updateRole(Role role);
		
		//Delete
		public void deleteRoleById(Long id);

}
