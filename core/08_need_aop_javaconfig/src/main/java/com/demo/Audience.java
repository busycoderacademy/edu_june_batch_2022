package com.demo;

import java.io.IOException;
import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

	//com.demo
	
	//public String doSuperMagic() 
	//public void doMagic() 
	
	//com.demo2
	//public String doSuperMag(String a) throws IOException
	
	@After("execution( * com.demo.*.do*(..) )")
	public void clappingAfter(JoinPoint joinPoint) {
		System.out.println("----------------------------");
		System.out.println(joinPoint.getSignature().getName());
		System.out.println("----------------------------");
		System.out.println("clapping  ... mazza aa gaya...after");
	}

	
	
	
	// @Before @After, @AfterReturning, @AfterThrowing @Around
//	@Before("execution(public void doMagic())")
//	public void clappingBefore() {
//		System.out.println("clapping  ... mazza aa gaya...before");
//	}

	// @Around can do?

	//ProceedingJoinPoint do 3 jobs
	//1. it can decicide that will u call target method or not
	//2. it used to get the return value from the target
	//3. used to get some infor about taget method using java reflection*
	
//	@Around("execution(public String doMagic())")
//	public String clappingAround(ProceedingJoinPoint jp) throws Throwable {
//		System.out.println("before calling the method..");
//		String value=  (String) jp.proceed();
//		//java reflection*
//		System.out.println(Modifier.toString(jp.getSignature().getModifiers())+": "+ jp.getSignature().getName());
//		System.out.println(" it was called..");
//		if(value.equals("rabbit"))
//		return value;
//		else
//			return "invalid";
//
//	}

	// this code is going to execute no mater what .. ie even if ex is coming that
	// code should executed

//	@After("execution(public void doMagic())")
//	public void clappingAfter(JoinPoint joinPoint) {
//		System.out.println("----------------------------");
//		System.out.println(joinPoint.getSignature().getName());
//		System.out.println("----------------------------");
//		System.out.println("clapping  ... mazza aa gaya...after");
//	}
//	
//
	// this code is going to execute iff the target method is ex successfully
//	@AfterReturning("execution(public void doMagic())")
//	public void clappingReturing() {
//		System.out.println("clapping  ... mazza aa gaya...@AfterReturning");
//	}

	// Spring REST: ex handling in rest end point @RestAdviceController

	// this method is going to be called iff target method is throwing some ex
//	@AfterThrowing(pointcut = "execution(public void doMagic())", throwing = "exception")
//	public void clappingReturing(Exception exception) {
//		System.out.println(exception.getMessage());
//		System.out.println("call the dr.");
//	}

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
