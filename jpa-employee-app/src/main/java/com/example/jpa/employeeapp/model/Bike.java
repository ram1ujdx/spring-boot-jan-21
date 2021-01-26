package com.example.jpa.employeeapp.model;

import javax.persistence.Entity;

@Entity
public class Bike extends Vehicle {

	int noOfWheels;
	float topSpeed;
	
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Bike(int noOfWheels, float topSpeed) {
		super();
		this.noOfWheels = noOfWheels;
		this.topSpeed = topSpeed;
	}



	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public float getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(float topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
	
}
