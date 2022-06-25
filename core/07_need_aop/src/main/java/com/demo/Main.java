package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//when magicician is showing the magic before that Audience do clapping
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("aop.xml");
		Magician magician=(Magician) ctx.getBean("m");
		magician.doMagic();
	}
}

