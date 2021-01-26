package com.example.jpa.employeeapp.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Car extends Vehicle {

	int noOfWheels;
	String musicSystemType;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Car(int noOfWheels, String musicSystemType) {
		super();
		this.noOfWheels = noOfWheels;
		this.musicSystemType = musicSystemType;
	}



	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getMusicSystemType() {
		return musicSystemType;
	}

	public void setMusicSystemType(String musicSystemType) {
		this.musicSystemType = musicSystemType;
	}
	
	
	
}
