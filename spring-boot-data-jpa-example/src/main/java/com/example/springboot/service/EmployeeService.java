package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public Employee getEmployeeById(int employeeId);
	public void deleteEmployee(int employeeId);
	public List<Employee> getAllEmployee();
	public Employee updateEmployee(Employee employee);
	public Employee getEmployeeByEmail(String email);
	
	
}
