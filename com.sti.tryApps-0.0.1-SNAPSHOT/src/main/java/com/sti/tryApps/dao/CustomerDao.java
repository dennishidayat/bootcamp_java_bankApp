package com.sti.tryApps.dao;

import java.util.List;

import com.sti.tryApps.model.Customer;

public interface CustomerDao {
	
	public Customer getById(int id) throws Exception;
	public Customer save(Customer CustData) throws Exception;
	void delete(Customer CustData) throws Exception;
	
	List<Customer> getList() throws Exception;

}
