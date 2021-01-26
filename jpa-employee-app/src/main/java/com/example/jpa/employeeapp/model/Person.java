package com.example.jpa.employeeapp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
//@Table(name ="person_info")
@NamedQuery(query = "from Person where personName=:personName", name = "findByName")
public class Person {

	@Id
	private int personId;
	
	private String personName;
	
	private LocalDate dob;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String personName, LocalDate dob) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.dob = dob;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", dob=" + dob + "]";
	}
	
	
	
}
