package com.example.mvn.service;

import java.sql.SQLException;

import com.example.mvn.model.Employee;

public interface IEmployeeService {

public Employee getEmployee(int empId) throws SQLException;
	
	public Employee addEmployee(Employee emp) throws SQLException;
	
	public boolean deleteEmployee(int empId);
	
}
