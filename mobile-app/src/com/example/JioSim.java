package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jio")
@Scope("prototype")
//@Lazy
public class JioSim implements Sim {

	public JioSim() {
		System.out.println("Jio Bean Created..");
	}
	
	public void call() {
		System.out.println("Calling with JIO...");
	}
	public void browse() {
		System.out.println("Browsing with JIO 4G...");
	}
	public void sendSms() {
		System.out.println("Sending SMS with JIO..");
	}
}
