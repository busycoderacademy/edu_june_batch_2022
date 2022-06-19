package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "v2")
public class Bike  implements Vehical{

	public void move() {
		System.out.println("moving on a bike from Preet Vihar-> ITO");
	}
}
