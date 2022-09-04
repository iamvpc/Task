package jdbcapp.service;

import java.util.List;
import java.util.ArrayList;

import jdbcapp.dto.Customer;

public interface CustomerService {
	//CRUD operations
	//REtrived
	public Customer getCustomerById(Integer customerId);
	public List<Customer> getAllCustomers();
	
	
	//Create
	public Integer addCustomer(Customer customer);
	//update
	public Integer updateCustomer(Customer customer);
	//Delete
	public Integer deleteCustomer(Integer customerId);

}
