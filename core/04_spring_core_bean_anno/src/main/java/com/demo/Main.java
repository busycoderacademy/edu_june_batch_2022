package com.demo;

public class Main {

	public static void main(String[] args) {
		Vehical vehical=new Car();
		Passanger passanger=new Passanger();
		passanger.setName("raj");
		passanger.setVehical(vehical);
		passanger.travel();
	}
}
