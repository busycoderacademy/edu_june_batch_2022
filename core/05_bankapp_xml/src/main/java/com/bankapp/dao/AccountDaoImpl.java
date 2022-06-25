package com.bankapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bankapp.entities.Account;

public class AccountDaoImpl implements AccountDao{

	private Map<Integer, Account> accounts=new HashMap<>();
	
	public AccountDaoImpl() {
		accounts.put(1, new Account(1, "raj", 560000.00));
		accounts.put(2, new Account(2, "ekta", 760000.00));
	}
	public List<Account> getAll() {
		return new ArrayList<Account>(accounts.values());
	}

	@Override
	public Account getById(int id) {
		return accounts.get(id);
	}

	@Override
	public void updateAccount(Account account) {
		accounts.put(account.getId(), account);
	}

	public void addAccount(Account account) {
		
	}

	public void deleteAccount(int id) {
		
	}

}
