package com.sti.tryApps.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sti.tryApps.model.Account;

public interface AccountRepository extends PagingAndSortingRepository<Account, Integer>{
	
}
