package com.demo;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo2.Mag;

public class Main {

	public static void main(String[] args) throws IOException {
		//when magicician is showing the magic before that Audience do clapping
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Magician magician=(Magician) ctx.getBean("m");
		magician.doSuperMagic(22);
	
		magician.doSuperMagic("foo",55.77);
		
		Mag mag=(Mag)ctx.getBean("mag",Mag.class);
		mag.doSuperMag("hello");
	}
}

