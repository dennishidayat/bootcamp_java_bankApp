package com.sti.tryApps.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sti.tryApps.model.Transaction;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Integer>{
	Transaction findById(int id);
}
