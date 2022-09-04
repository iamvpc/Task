package com.prodapt.employeeapplication1.exception;



import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component

public class InvalidCredentialsException extends Exception {
	private String message;

	/**
	 * @param message
	 */
	public InvalidCredentialsException(String message) {
		super();
		this.message = message;
	}

	/**
	 * 
	 */
	public InvalidCredentialsException() {
		super();
	}

	@Override
	public String toString() {
		return "InvalidCredentialsException [message=" + message + "]";
	}
	

}
