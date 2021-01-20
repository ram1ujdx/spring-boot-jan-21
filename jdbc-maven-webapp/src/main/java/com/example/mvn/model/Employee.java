package com.example.mvn.model;

public class Employee {

	private int empId;
	private String empName;
	private String email;
	public Employee() {
	}
	public Employee(int empId, String empName, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
