package com.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

	@Before("execution(public void doMagic())")
	public void clappingBefore() {
		System.out.println("clapping  ... mazza aa gaya...before");
	}
	
	@After("execution(public void doMagic())")
	public void clappingAfter() {
		System.out.println("clapping  ... mazza aa gaya...after");
	}
	
	
	@AfterReturning("execution(public void doMagic())")
	public void clappingReturing() {
		System.out.println("clapping  ... mazza aa gaya...@AfterReturning");
	}
	
	
//	@After("execution(public void doMagic())")
//	public void clapping() {
//		System.out.println("clapping  ... mazza aa gaya...");
//	}
//	
//	@After("execution(public void doMagic())")
//	public void clapping() {
//		System.out.println("clapping  ... mazza aa gaya...");
//	}
	
}
