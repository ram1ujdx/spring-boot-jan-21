package com.example;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mobile")
@Scope("prototype")
//@Lazy
public class Mobile implements InitializingBean, DisposableBean{
	

	@Autowired
	@Qualifier("airtel")
	Sim sim;
	@Value("${brandName}")
	String brandName;
	@Value("${ram}")
	int ram;
	@Value("${storage}")
	int storage;
	@Value("#{${supportedNetworks}}")
	List<String> supportedNetworks;	
	
	
	
	
	public Mobile() {
		System.out.println("Mobile Bean Created...");
	}
	
	
	public Mobile(Sim sim) {
		System.out.println("Constructor based Injection..");
		this.sim = sim;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init Method Invoked");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre Destroy Method Invoked..");
	}


	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		System.out.println("Setter Method Called");
		this.sim = sim;
	}
	
	
	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getStorage() {
		return storage;
	}


	public void setStorage(int storage) {
		this.storage = storage;
	}

	

	public List<String> getSupportedNetworks() {
		return supportedNetworks;
	}


	public void setSupportedNetworks(List<String> supportedNetworks) {
		this.supportedNetworks = supportedNetworks;
	}


	void makeACall() {
		sim.call();
	}
	void browseInternet() {
		sim.browse();
	}
	void sendSms() {
		sim.sendSms();
	}

	

	@Override
	public String toString() {
		return "Mobile Info -  [brandName=" + brandName + ", ram=" + ram + ", storage=" + storage +  "\n Supported Networks="
				+ supportedNetworks + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization Bean Method Invoked..");
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Disposible Bean Method Invoked..");
		
	}


	
	
	
}
