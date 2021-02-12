package com.example.springboot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.springboot.model.Employee;
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Employee addEmployee(Employee employee) {
		 em.persist(employee);
		 return employee;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return em.find(Employee.class, employeeId);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		Employee emp=em.find(Employee.class, employeeId);
		if(emp!=null) {
		em.remove(emp);
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		TypedQuery<Employee> query=em.createQuery("from Employee",Employee.class);
		return query.getResultList();
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return em.merge(employee);
	}
	
	@Override
	public Employee getEmployeeByEmail(String email) {
		TypedQuery<Employee> query=em.createQuery("from Employee where email=:email",Employee.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}

}
