package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

///@Component vs @Bean

@Component(value = "p")
public class Passanger {

	private String name;

	private Vehical vehical;

	
	@Autowired
	public Passanger( Vehical vehical) {
		System.out.println("public Passanger( Vehical vehical)");
		this.vehical = vehical;
	}

	@Value(value = "raja")
	public void setName(String name) {
		System.out.println("public void setName(String name)");
		this.name = name;
	}

	@Autowired
	public void setVehical(Vehical vehical) {
		System.out.println("public void setVehical(Vehical vehical)");
		this.vehical = vehical;
	}

	public void travel() {
		System.out.println("passanger name: " + name);
		vehical.move();
	}

}
