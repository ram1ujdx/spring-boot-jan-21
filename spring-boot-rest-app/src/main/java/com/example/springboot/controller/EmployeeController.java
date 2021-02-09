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
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Employee;
import com.example.springboot.model.Message;
import com.example.springboot.repository.EmployeeRepo;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;

	@GetMapping("/hello")
	public Message show() {
		return new Message("Hello World");
	}
	
	@GetMapping("/employee/id/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") int employeeId) {
		
		Employee emp=repo.getEmployee(employeeId);
		return emp;
	}
	
	@GetMapping("/employee/email/{email}")
	public Employee getEmployeeByEmail(@PathVariable("email") String email) {
		
		Employee emp=repo.getEmployeeByEmail(email);
		return emp;
	}
	
	@GetMapping(value = "/employees", produces = "application/json")
	
	public List<Employee> getAllEmployees(){
		return repo.getAllEmployees();
	}
	
	
	@PostMapping(value = "/employee", consumes = "application/json")
	public Employee addEmployee(@RequestBody Employee emp) {
		return repo.addEmployee(emp);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return repo.updateEmployee(emp);
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity deleteEmployee(@PathVariable int employeeId) {
		if(repo.getEmployee(employeeId)==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		repo.deleteEmployee(employeeId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
