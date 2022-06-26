package com.demo;

import java.io.IOException;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Magician main job is to the magic
//clapping is a cross cutting concern for him
//if i am going for a training session i need focus on my teaching rather then projector and WB

@Component(value = "m")
 public class Magician {
	
	public String eating() {
		return "eating";
	}

	public String doSuperMagic(String a, Double b) throws IOException{
		System.out.println("bring moon from the hat");
		return "moon";
	}
	
	public void doSuperMagic(Integer val) {
		System.out.println("bring rabbit from the hat");
	}
	
	
}
