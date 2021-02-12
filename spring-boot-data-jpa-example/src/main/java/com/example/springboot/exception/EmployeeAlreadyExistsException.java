package com.example.springboot.exception;

public class EmployeeAlreadyExistsException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4273179651733742995L;

	public EmployeeAlreadyExistsException(String message) {
		super(message);
	}

}
