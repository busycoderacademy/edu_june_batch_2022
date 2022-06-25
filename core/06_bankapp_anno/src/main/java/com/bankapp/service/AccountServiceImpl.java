package com.bankapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImpl;
import com.bankapp.dao.AccountDaoImplJdbc;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;

//  accountServiceImpl
@Service(value = "accService")
public class AccountServiceImpl implements AccountService {

	// field injection is always avoided
	private AccountDao accountDao;

	private EmailService emailService;
	
	private Logger logger=LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	// if it is a mendantory dep then u must go for ctr inject
	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(int fromAccountId, int toAccountId, double amount) {

		long start = System.currentTimeMillis();

		Account fromAcc = accountDao.getById(fromAccountId);
		Account toAcc = accountDao.getById(toAccountId);

		// now we have to withdraw from one acc and dep to other
		fromAcc.setBalance(fromAcc.getBalance() - amount);

		toAcc.setBalance(toAcc.getBalance() + amount);

		accountDao.updateAccount(fromAcc);
		accountDao.updateAccount(toAcc);

		if (emailService != null) {
			emailService.sendEmail("rgupta.mtech@gmail.com");
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		long end = System.currentTimeMillis();
		logger.info("time taken for this transfer method : " + (end - start) + " ms");
	}

	@Override
	public void deposit(int accountId, double amount) {
		Account account = accountDao.getById(accountId);
		account.setBalance(account.getBalance() + amount);
		accountDao.updateAccount(account);
	}

	@Override
	public void withdraw(int accountId, double amount) {
		Account account = accountDao.getById(accountId);
		if (account == null)
			throw new BankAccountNotFoundException("account :" + accountId + " is not found");
		account.setBalance(account.getBalance() - amount);
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
