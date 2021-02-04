package com.example;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");.
		ApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);
		Mobile mobile1=(Mobile)context.getBean("mobile");
		mobile1.browseInternet();
		mobile1.makeACall();
		mobile1.setRam(6);
		System.out.println(mobile1);
		
		System.out.println("\n-------------------------------------\n");
		Mobile mobile2=(Mobile)context.getBean("mobile");
		mobile2.browseInternet();
		mobile2.makeACall();
		System.out.println(mobile2);
		
		Sim sim=context.getBean("jio",Sim.class);
		sim=context.getBean("jio",Sim.class);
		sim=context.getBean("jio",Sim.class);

	}

}
