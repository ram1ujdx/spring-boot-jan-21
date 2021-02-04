package com.example;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.example"})
@PropertySource(value = "mobile.properties")
public class MobileConfig {

}








//@Bean(name = "airtel")
//public AirtelSim getAirtelSim() {
//	AirtelSim sim=new AirtelSim();
//	return sim;
//}
//
//@Bean(name = "jio")
//public JioSim getJioSim() {
//	JioSim sim=new JioSim();
//	return sim;
//}

//@Bean(name="samsung", autowire = Autowire.BY_NAME)
//public Mobile getSamsungMobile() {
//	Mobile mobile=new Mobile();
//	mobile.setBrandName("Samsung");
//	mobile.setRam(8);
//	mobile.setStorage(128);
//	List<String> supportedNets=Arrays.asList("HSPA","4G LTE","5G");
//	mobile.setSupportedNetworks(supportedNets);
//	return mobile;
//}
//
//@Bean(name="apple", autowire = Autowire.BY_NAME)
//public Mobile getAppleMobile() {
//	Mobile mobile=new Mobile();
//	mobile.setBrandName("Apple");
//	mobile.setRam(4);
//	mobile.setStorage(64);
//	List<String> supportedNets=Arrays.asList("GPRS","HSPA","4G LTE");
//	mobile.setSupportedNetworks(supportedNets);
//	return mobile;
//}