package com.example.jpa.employeeapp.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "Vehicle_Type")
public class Vehicle {

	@Id
	protected String regNo;
	protected String color;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String regNo, String color) {
		super();
		this.regNo = regNo;
		this.color = color;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", color=" + color + "]";
	}
	
	
	
}
