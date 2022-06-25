package com.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Magician main job is to the magic
//clapping is a cross cutting concern for him
//if i am going for a training session i need focus on my teaching rather then projector and WB

@Aspect
@Component(value = "m")
 public class Magician {

	public void doMagic() {
		System.out.println("abra ka dabra..");
	}
	

	@Before("execution(public void doMagic())")
	public void clappingBefore() {
		System.out.println("clapping  ... mazza aa gaya...before");
	}
	
}
