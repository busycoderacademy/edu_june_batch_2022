package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingXML {

	public static void main(String[] args) {
		//spring will create the "container" object
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		
		//by default beans are singleton and eagerly creating
		Passanger passanger=(Passanger) ctx.getBean("p");
		System.out.println(passanger.hashCode());
//		
//		Passanger passanger2=(Passanger) ctx.getBean("p");
//		System.out.println(passanger2.hashCode());
		
		passanger.travel();
	}
}
