package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springboot.model.Employee;

public interface EmployeeJpaRepo extends JpaRepository<Employee, Integer>{

	@Query("from Employee where email=:email")
	public Employee getEmployeeFromEmail(String email);
	
}
