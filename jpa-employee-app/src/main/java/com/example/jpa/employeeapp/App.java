package com.example.jpa.employeeapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.jpa.employeeapp.model.Department;
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
       
// Adding Employee       
//       Employee emp2,emp3;
//       tx.begin(); 
//  //    Employee emp1=new Employee("Nilesh", "nilesh@yahho.com");   // New State
//      emp2=new Employee( "Pritam", "pritam@yahho.com");
//      emp3=new Employee( "Rahul", "rahul@yahho.com");
//       
//       
////       entityManager.persist(emp1);							  // Manged State
//       entityManager.persist(emp2);
//       entityManager.persist(emp3);
//       tx.commit();
//       entityManager.close();
//       System.out.println("Employee Added Successfully");

// Finding Employee       
//       Employee e1=entityManager.find(Employee.class, 1025);
//       System.out.println(e1.getEmpName());
       
// Delete Employee
//       tx.begin();
//       Employee e1=entityManager.find(Employee.class, 1025); // Managed State
//       entityManager.remove(e1);								// Removed State
//       tx.commit();
       
// Update Employee
//       Employee e1=entityManager.find(Employee.class, 1026); // Mnaged State
//       tx.begin();
//       e1.setEmpName("Pritam Sharma");
//       entityManager.persist(e1);
//       entityManager.detach(e1);  							// Detached State
//       e1.setEmpName("Rohit Sharma");
//       tx.commit();
       
// Get All Employees
       
//       Query qGetAll=entityManager.createQuery("from Employee");
//       
//       List<Employee> employees=qGetAll.getResultList();
//       
//       employees.forEach(System.out::println);
//       
       
       
 // JPA Mapping
       
//       Department d1=new Department(100012, "IT", "Bangalore");
//       Employee e1=new Employee("Tushar", "tushar@gmail.com");
//       e1.setDept(d1);
//       d1.getEmployees().add(e1);
//       
//       tx.begin();
//       entityManager.persist(d1);
//       entityManager.persist(e1);
//       tx.commit();
       
       Employee e1=entityManager.find(Employee.class, 1);
//      System.out.println(e1);
       
       
       
       
    }
}
