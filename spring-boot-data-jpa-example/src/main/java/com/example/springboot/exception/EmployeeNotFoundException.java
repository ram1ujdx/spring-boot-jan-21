package com.example.springboot.exception;

public class EmployeeNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4273179651733742995L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
