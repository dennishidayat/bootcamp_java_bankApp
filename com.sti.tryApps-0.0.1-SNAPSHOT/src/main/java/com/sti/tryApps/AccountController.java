package com.sti.tryApps;

import java.util.*;
import java.util.List;

import org.hibernate.exception.SQLGrammarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.tryApps.dao.AccountDao;
import com.sti.tryApps.model.Account;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountDao accountDao;
	@GetMapping("/id")
	public String getById(@RequestParam(value="id", defaultValue="") int id) {
		try {
			Account account = accountDao.getById(id);
			if (account==null) {
				return "Data not found";
			}else {
				return "balance : "+account.getBalance();
			}
		} catch (SQLGrammarException e) {
			return String.format("error occurred SQL! Message : "+e.getMessage());
		} 
		catch (NumberFormatException e) {
			return "Invalid input";
		}catch (Exception e) {
			return String.format("error occurred! Message : "+e.getMessage());
		}
	}
	
	@PostMapping("/insert")
	public Account insert(@RequestBody Account CustData) throws Exception {
		accountDao.save(CustData);
		return CustData;
	}
	
	@PutMapping("/edit")
	public Account edit(@RequestBody Account CustData) throws Exception {
		accountDao.save(CustData);
		return CustData;
	}
	
	@DeleteMapping("/delete")
	public Account delete(@RequestBody Account CustData) throws Exception {
		CustData.getAccountnumber();
		accountDao.delete(CustData);
		return CustData;
	}
	
	@GetMapping("/list")
	public List<Account> list(@RequestBody Account CustData) throws Exception{
		try {
			List<Account> list = accountDao.getList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}
}
