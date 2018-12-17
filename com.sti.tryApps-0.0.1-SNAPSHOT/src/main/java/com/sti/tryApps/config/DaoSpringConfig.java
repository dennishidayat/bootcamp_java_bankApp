package com.sti.tryApps.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sti.tryApps.dao.AccountDao;
import com.sti.tryApps.dao.CustomerDao;
import com.sti.tryApps.dao.TransactionDao;
import com.sti.tryApps.dao.Impl.AccountDaoImlp;
import com.sti.tryApps.dao.Impl.CustomerDaoImpl;
import com.sti.tryApps.dao.Impl.TransactionDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public CustomerDao customerDao() {
		return new CustomerDaoImpl();
	}
	
	@Bean
	public AccountDao accountDao() {
		return new AccountDaoImlp();
	}
	
	@Bean
	public TransactionDao transactionDao() {
		return new TransactionDaoImpl();
	}
}
