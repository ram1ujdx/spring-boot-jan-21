package com.example.jpa.employeeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table(name = "employee_info")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name = "emp_Name")
	private String empName;
	@Column(nullable = false, unique = true)
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Department dept;
	
	
	
	
	@Transient
	private int tempId;
	
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getTempId() {
		return tempId;
	}
	public void setTempId(int tempId) {
		this.tempId = tempId;
	}
	public Employee() {
	}
	public Employee(String empName, String email) {
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", dept=" + dept + ", tempId="
				+ tempId + "]";
	}
	
	
	
	
	
}
