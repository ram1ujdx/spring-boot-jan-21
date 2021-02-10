package com.example.springboot.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "employee_info")
public class Employee {
	
	@Id
	int employeeId;
	@Column(name = "employee_name")
	String employeeName;
	@Column(unique = true)
	String email;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate dob;
	
	
	
	
	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
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
	
	
	
	
}
