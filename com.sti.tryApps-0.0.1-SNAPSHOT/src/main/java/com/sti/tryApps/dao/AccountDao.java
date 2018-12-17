package com.sti.tryApps.dao;

import java.util.List;
import com.sti.tryApps.model.Account;

public interface AccountDao {
	public Account getById(int id) throws Exception;
	public Account save(Account CustData) throws Exception;
	void delete(Account CustData) throws Exception;
	
	List<Account> getList() throws Exception;
}
