package jdbcapp.service;

import java.util.List;

import jdbcapp.dao.CustomerDAO;
import jdbcapp.dao.CustomerDAOImpl;
import jdbcapp.dto.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDao = new CustomerDAOImpl();

	public Customer getCustomerById(Integer customerId) {

		return customerDao.getCustomerById(customerId);
	}

	public List<Customer> getAllCustomers() {

		return customerDao.getAllCustomers();
	}

	public Integer addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	public Integer updateCustomer(Customer customer) {

		return customerDao.updateCustomer(customer);
	}

	public Integer deleteCustomer(Integer customerId) {

		return customerDao.deleteCustomer(customerId);
	}

	public void addCustomerUsingSP(Customer customer) {
		customerDao.addCustomerUsingSP(customer);
		
	}

}
