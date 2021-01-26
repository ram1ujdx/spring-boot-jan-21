package com.example.jpa.employeeapp;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.example.jpa.employeeapp.model.Bike;
import com.example.jpa.employeeapp.model.Car;
import com.example.jpa.employeeapp.model.Department;
import com.example.jpa.employeeapp.model.Employee;
import com.example.jpa.employeeapp.model.Person;
import com.example.jpa.employeeapp.model.Vehicle;

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
       
//       Employee e1=entityManager.find(Employee.class, 1);
//      System.out.println(e1);
  
       
 //    Inheritance
       
//       Vehicle car=new Car(4, "Delux");
//       car.setColor("Red");
//       car.setRegNo("KA05 2135");
//       
//       Vehicle bike=new Bike(4, 155.5f);
//       bike.setColor("Black");
//       bike.setRegNo("KA05 2002");
//       tx.begin();
//       entityManager.persist(car);
//       entityManager.persist(bike);
//       tx.commit();
       
  
 //     JPQL      
       
       Person p1,p2,p3,p4;
       
       p1=new Person(12201, "Rajesh", LocalDate.of(1995, 5, 15));
       p2=new Person(12202, "Harish", LocalDate.of(1996, 2, 25));
       p3=new Person(12203, "Javed", LocalDate.of(1993, 3, 21));
       p4=new Person(12204, "Manish", LocalDate.of(1992, 10, 10));
       
//       tx.begin();
//       entityManager.persist(p1);
//       entityManager.persist(p2);
//       entityManager.persist(p3);
//       entityManager.persist(p4);
//       tx.commit();
       
//       Person p=entityManager.find(Person.class, 12203);
//       System.out.println(p);
       
       
//       TypedQuery<Person> getAll=entityManager.createQuery("from Person where personId>:personId",Person.class);
//       getAll.setParameter("personId", 12201);
//       List<Person> persons=getAll.getResultList();
//       persons.forEach(person->System.out.println(person));
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a name to search : ");
       String name=scan.nextLine();
       TypedQuery<Person> findByName=entityManager.createNamedQuery("findByName",Person.class);
       findByName.setParameter("personName",name );
      try { 
       Person p=findByName.getSingleResult();
       
    	   System.out.println(p);
      }
      catch (Exception e) {
    	  System.err.println("No Data Found");
	}
       
		
	
       
       
    }
}
