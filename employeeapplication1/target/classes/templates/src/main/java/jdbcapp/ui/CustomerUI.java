package jdbcapp.ui;

import java.time.LocalDate;

import jdbcapp.dto.Customer;
import jdbcapp.service.CustomerService;
import jdbcapp.service.CustomerServiceImpl;

public class CustomerUI {

	public static void main(String[] args) {
		CustomerService obj=new CustomerServiceImpl();
		System.out.println(obj.getAllCustomers());
		
		Customer customer1=new Customer(1,"Neha Sharma",LocalDate.of(1991, 05, 14),9978541555L,"vaib@gmail.com");
				Integer numberOfRowAdd= obj.addCustomer(customer1);
		
		System.out.println(numberOfRowAdd);
				
	}

}
