package jdbcapp.dao;

import java.sql.SQLException;
import java.util.List;

import jdbcapp.dto.Customer;

public interface CustomerDAO {
	//CRUD operations 
		//Retrieve 
		public Customer getCustomerById(Integer customerId);
		public List<Customer> getAllCustomers();
		//Create 
		public Integer addCustomer(Customer customer);
		//Update
		public Integer updateCustomer(Customer customer);
		//Delete
		public Integer deleteCustomer(Integer customerId);
		
		//Call Stored Procedure
			public void addCustomerUsingSP(Customer customer);
	}

	 
		
	 
