package com.example.springboot.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.springboot.model.Employee;

@Repository
public class EmployeeRepo {

	Map<Integer, Employee> emps;
	
	@PostConstruct
	public void createSomeDummyEmployees() {
		emps=new HashMap<>();
		emps.put(100012, new Employee(100012, "Rohan Kumar", "rk@gmail.com"));
		emps.put(100014, new Employee(100014, "Karan Kumar", "karan@gmail.com"));
		emps.put(100015, new Employee(100015, "Javed Ahmed", "javed@gmail.com"));
		
	}
	
	public Employee getEmployee(int employeeId) {
		return emps.get(employeeId);
	}
	
	public Employee getEmployeeByEmail(String email) {
	
		for(Employee  emp:emps.values()) {
			if(emp.getEmail().equals(email)) {
				return emp;
			}
		}
		return null;
		
		
	}
	
	public List<Employee> getAllEmployees() {
		
		List<Employee> empList=new ArrayList<>(emps.values());
		
		return  empList;
	}
	
	public Employee addEmployee(Employee emp) {
		emps.put(emp.getEmployeeId(), emp);
		return emp;
	}

	public Employee updateEmployee(Employee emp) {
		
		emps.put(emp.getEmployeeId(), emp);
		return emp;
	}

	public void deleteEmployee(int employeeId) {
		emps.remove(employeeId);
	}
	
	
	
}
