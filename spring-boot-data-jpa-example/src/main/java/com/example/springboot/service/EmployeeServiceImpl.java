package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.exception.EmployeeAlreadyExistsException;
import com.example.springboot.exception.EmployeeNotFoundException;
import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeJpaRepo;
import com.example.springboot.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeJpaRepo repo;
	
//	@Autowired
//	private EmployeeRepo empRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		if(repo.existsById(employee.getEmployeeId())) {
			throw new EmployeeAlreadyExistsException("Employee Alreday Exists");
		}
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		if(!repo.existsById(employeeId)) {
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		return repo.getOne(employeeId);
	}


	@Override
	public void deleteEmployee(int employeeId) {
		if(!repo.existsById(employeeId)) {
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		repo.deleteById(employeeId);

	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		if(!repo.existsById(employee.getEmployeeId())) {
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		return repo.save(employee);
	}
	
	@Override
	public Employee getEmployeeByEmail(String email) {
		
		Employee emp= repo.getEmployeeFromEmail(email);
		if(emp==null) {
				throw new EmployeeNotFoundException("Employee Not Found");
		}
		return emp;
	}

}
