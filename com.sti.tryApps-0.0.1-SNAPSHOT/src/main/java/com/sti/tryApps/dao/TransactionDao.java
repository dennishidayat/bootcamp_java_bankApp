package com.sti.tryApps.dao;

import java.util.List;

import com.sti.tryApps.model.Transaction;

public interface TransactionDao {
	public Transaction getById(int id) throws Exception;
	public Transaction save(Transaction CustData) throws Exception;
	void delete(Transaction CustData) throws Exception;
	
	List<Transaction> getList() throws Exception;
}

