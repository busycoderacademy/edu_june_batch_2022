package com.demo2;

import java.io.IOException;

import org.springframework.stereotype.Component;
@Component(value = "mag")
public class Mag {
	
	public String doSuperMag(String a) throws IOException{
		System.out.println("bring moon from the hat");
		return "moon";
	}
}
