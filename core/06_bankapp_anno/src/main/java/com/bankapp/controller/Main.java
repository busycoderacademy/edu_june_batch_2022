package com.bankapp.controller;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bankapp.xml");
		AccountService accService=applicationContext.getBean("accService",AccountService.class);
		
		List<Account> accounts=accService.getAll();
		accounts.forEach(acc-> System.out.println(acc));
		
		accService.transfer(1, 2, 1000);
		
		System.out.println("---------------");
		 accounts=accService.getAll();
		accounts.forEach(acc-> System.out.println(acc));
		
		//logging--> Slf4j--->   log4j,logback, common logging
		System.out.println("code is working till line no 25");
		
		
		//
		
		///
		///
		
		
	}
}
