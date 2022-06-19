package com.demo;

//pull model
public class Passanger {

	private String name;

	private Vehical vehical;

	public void setName(String name) {
		System.out.println("public void setName(String name)");
		this.name = name;
	}

	public void setVehical(Vehical vehical) {
		System.out.println("public void setVehical(Vehical vehical)");
		this.vehical = vehical;
	}

	public void travel() {
		System.out.println("passanger name: " + name);
		vehical.move();
	}

}
