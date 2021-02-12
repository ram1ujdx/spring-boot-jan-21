package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.springboot.exception.EmployeeNotFoundException;
import com.example.springboot.model.Employee;
import com.example.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId) {
		
		return service.getEmployeeById(employeeId);
		
	}

	
//  Exception Handling using ResponseStatusException
	
//	@GetMapping("/employees/{employeeId}")
//	public Employee getEmployeeById(@PathVariable int employeeId) {
//		try {
//		return service.getEmployeeById(employeeId);
//		}
//		catch (EmployeeNotFoundException e) {
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
//		}
//	}
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public void deleteEmployee(@PathVariable int employeeId ) {
		service.deleteEmployee(employeeId);
	}
	
	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		Employee emp= service.updateEmployee(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.ACCEPTED);
	}
	@GetMapping("/employees/email/{email}")
	public Employee getEmployeeByEmail(@PathVariable String email)
	{
		return service.getEmployeeByEmail(email);
	}
	
	
}
