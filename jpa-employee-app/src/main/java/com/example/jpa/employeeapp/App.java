package com.example.jpa.employeeapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.example.jpa.employeeapp.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory factory=Persistence.createEntityManagerFactory("employee.pu");
       EntityManager entityManager=factory.createEntityManager();
       EntityTransaction tx=entityManager.getTransaction();
       Employee emp=new Employee(1025, "Nilesh", "nilesh@yahho.com");
       tx.begin();
       entityManager.persist(emp);
       tx.commit();
       System.out.println("Employee Added Successfully");
       
       
       
    }
}