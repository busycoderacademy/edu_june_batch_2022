package com.bankapp.service;

import java.util.List;

import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImpl;
import com.bankapp.dao.AccountDaoImplJdbc;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;

public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(int fromAccountId, int toAccountId, double amount) {
		Account fromAcc=accountDao.getById(fromAccountId);
		Account toAcc=accountDao.getById(toAccountId);
		
		//now we have to withdraw from one acc and dep to other
		fromAcc.setBalance(fromAcc.getBalance()- amount);
		
		toAcc.setBalance(toAcc.getBalance()+ amount);
		
		accountDao.updateAccount(fromAcc);
		accountDao.updateAccount(toAcc);
		
	}

	@Override
	public void deposit(int accountId, double amount) {
		Account account=accountDao.getById(accountId);
		account.setBalance(account.getBalance()+amount);
		accountDao.updateAccount(account);
	}

	@Override
	public void withdraw(int accountId, double amount) {
		Account account=accountDao.getById(accountId);
		if(account==null)
			throw new BankAccountNotFoundException("account :"+accountId+" is not found");
		account.setBalance(account.getBalance()-amount);
		accountDao.updateAccount(account);
	}

	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		return accountDao.getById(id);
	}

}
