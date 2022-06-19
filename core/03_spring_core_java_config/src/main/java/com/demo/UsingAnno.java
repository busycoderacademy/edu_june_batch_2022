package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingAnno {

	public static void main(String[] args) {
		//spring will create the "container" object
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//by default beans are singleton and eagerly creating
		Passanger passanger=(Passanger) ctx.getBean("p");
		System.out.println(passanger.hashCode());
//		
//		Passanger passanger2=(Passanger) ctx.getBean("p");
//		System.out.println(passanger2.hashCode());
		
		passanger.travel();
	}
}
