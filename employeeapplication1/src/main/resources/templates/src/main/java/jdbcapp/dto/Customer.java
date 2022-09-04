package jdbcapp.dto;

import java.time.LocalDate;

public class Customer {
	private Integer customerId;
	private String customerName;
	private LocalDate birthDate;
	private long mobile;
	private String email;
	

	public Customer() {
		super();
	}
	public Customer(Integer customerId, String customerName, LocalDate birthDate, long mobile, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.birthDate = birthDate;
		this.mobile = mobile;
		this.email = email;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", birthDate=" + birthDate
				+ ", mobile=" + mobile + ", email=" + email + "]";
	}
	
}