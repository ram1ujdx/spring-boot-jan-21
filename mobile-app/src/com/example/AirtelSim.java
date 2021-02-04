package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("airtel")
@Scope("prototype")
//@Lazy
public class AirtelSim implements Sim {

	public AirtelSim() {
		System.out.println("Airtel Bean Created..");
	}
	
	public void call() {
		System.out.println("Calling with Airtel...");
	}
	public void browse() {
		System.out.println("Browsing with Airtel 4G...");
	}
	public void sendSms() {
		System.out.println("Sending SMS with Airtel..");
	}
}
