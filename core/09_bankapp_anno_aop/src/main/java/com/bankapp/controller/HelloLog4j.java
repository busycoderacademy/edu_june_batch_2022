package com.bankapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLog4j {

	private static Logger logger=LoggerFactory.getLogger(HelloLog4j.class);
	
	public static void main(String[] args) {
		
		//System.out.println("code is woking till line 7");
		logger.info("code is working till line 7");
		
		try{
			String val="33A";
			Integer valInt=Integer.parseInt(val);
			System.out.println(valInt);
		}catch(Exception e) {
			logger.error("some error occurred"+ e);
		}
		
	
		//System.out.println("code is woking till line 12");
		
	}
}
