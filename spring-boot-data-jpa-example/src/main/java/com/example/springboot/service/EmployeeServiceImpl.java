package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	@Transactional
	public Employee addEmployee(Employee employee) {
		return repo.addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return repo.getEmployeeById(employeeId);
	}

	@Transactional
	@Override
	public void deleteEmployee(int employeeId) {
		
		repo.deleteEmployee(employeeId);

	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.getAllEmployee();
	}

	@Transactional
	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.updateEmployee(employee);
	}

}
