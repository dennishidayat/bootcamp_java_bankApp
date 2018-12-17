package com.sti.tryApps.dao.repository;

import com.sti.tryApps.model.Customer;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer>{
//	Customer findByCustNum(int customernumber);
}
