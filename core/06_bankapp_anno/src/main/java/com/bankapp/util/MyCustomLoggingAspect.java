package com.bankapp.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
//2. class to handle logging in my project
@Component
@Aspect
public class MyCustomLoggingAspect {

	private Logger logger=LoggerFactory.getLogger(MyCustomLoggingAspect.class);
	
	//if any exccepions is coming in serice layer i should put this into the log files and share with my team
	@AfterThrowing(pointcut = "execution(* com.bankapp.service.*Impl.*(..))", throwing = "exception")
	public void logAllServiceLayerExcetions(Exception exception) {
		logger.error("error occured in service layer"+exception.getMessage());
	}
	
	
	@Around("@annotation(MyLogger)")
	public void calulateTimeTaken(ProceedingJoinPoint pjp) throws Throwable {
		
		long start = System.currentTimeMillis();

		pjp.proceed();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		long end = System.currentTimeMillis();
		logger.info("time taken for this transfer method : " + (end - start) + " ms");
	}
	
}
