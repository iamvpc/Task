package jdbcapp.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcapp.dto.Customer;
import jdbcapp.util.DBConnSingleton;
import jdbcapp.util.DBConnectionUtil;

public class CustomerDAOImplSingle {
	public Customer getCustomerById(Integer customerId) {
		//Parameterized Query or dynamic query will have to use
		//select * from customer where customerId=1;
		Customer customer = new Customer();
		try {
		PreparedStatement pStmt =DBConnSingleton.getDBConnection().prepareStatement("select * from customer where customerId=?");
		pStmt.setInt(1, customerId);
		ResultSet rs = pStmt.executeQuery();
		if(rs.next()) {
			// Setting data from resultset to domain object in application
			customer.setCustomerId(rs.getInt(1));
			customer.setCustomerName(rs.getString("customerName"));
			customer.setEmail(rs.getString("email"));
			customer.setMobile(rs.getLong("mobile"));
			customer.setBirthDate(rs.getDate(3).toLocalDate());
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> customerList= new ArrayList<Customer>();
		try {
			// Get a connection object
			//Connection con = DBConnectionUtil.getDBConnection();
			// Create a Statement
			Statement statement = DBConnSingleton.getDBConnection().createStatement();
			//Statement statement = con.createStatement();
			// Execute a statement
			ResultSet resultSet = statement.executeQuery("select  * from customer");
			// Process the resultset
			while(resultSet.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString("customerName"));
				customer.setEmail(resultSet.getString("email"));
				customer.setMobile(resultSet.getLong("mobile"));
				customer.setBirthDate(resultSet.getDate(3).toLocalDate());
				
				customerList.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		return customerList;
	}

	public Integer addCustomer(Customer customer) {
		int row =0;
		try {
		PreparedStatement preparedStatement = DBConnSingleton.getDBConnection()
				.prepareStatement("INSERT INTO CUSTOMER(customerId,customerName,birthDate,mobile,email) VALUES(?,?,?,?,?)");
		preparedStatement.setInt(1, customer.getCustomerId());
		preparedStatement.setString(2, customer.getCustomerName());
		preparedStatement.setDate(3, Date.valueOf(customer.getBirthDate()));
		preparedStatement.setLong(4, customer.getMobile());
		preparedStatement.setString(5, customer.getEmail());
		row = preparedStatement.executeUpdate();
		}catch (SQLException e) { 
			e.printStackTrace();
		}
		return row;

}

	public Integer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCustomerUsingSP(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
