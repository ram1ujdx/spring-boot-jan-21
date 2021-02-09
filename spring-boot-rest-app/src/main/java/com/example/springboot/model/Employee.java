package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {

	private int employeeId;
	private String employeeName;
	//@JsonIgnore
	private String email;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + "]";
	}
	
	
	
	
	
}
