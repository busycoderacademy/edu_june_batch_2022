package com.bankapp.service;
import java.util.*;

import com.bankapp.entities.Account;
public interface AccountService {
	public void transfer(int fromAccountId, int toAccountId, double amount);
	public void deposit(int accountId, double amount);
	public void withdraw(int accountId, double amount);
	
	public List<Account> getAll();
	public Account getById(int id);
	
	
}
