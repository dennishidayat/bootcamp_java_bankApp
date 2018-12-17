package com.sti.tryApps;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.tryApps.dao.TransactionDao;
import com.sti.tryApps.model.Transaction;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	private TransactionDao transactionDao;
	
	@GetMapping("/id")
	public String getById(@RequestParam(value="id", defaultValue="") int id) {
		try {
			Transaction transaction = transactionDao.getById(id);
			if (transaction==null) {
				return "Data not found";
			} else {
				return "trx amount : " +transaction.getAmount();
			}
			
		} catch (NumberFormatException e) {
			return String.format("invalid input ");
		} catch (Exception e) {
			return "error occurred! Message : " +e.getMessage();
		}
	}
	
	@PostMapping("/insert")
	public Transaction insert(@RequestBody Transaction CustData) throws Exception {
		transactionDao.save(CustData);
		return CustData;
	}
	
	@PutMapping("/edit")
	public Transaction edit(@RequestBody Transaction CustData) throws Exception {
		transactionDao.save(CustData);
		return CustData;
	}
	
	@DeleteMapping("delete")
	public Transaction delete(@RequestBody Transaction CustData) throws Exception {
		CustData.getAccNumber();
		transactionDao.delete(CustData);
		return CustData;
	}
	
	@GetMapping("/list")
	public List<Transaction> list(@RequestBody Transaction CustData) throws Exception {
		try {
			List<Transaction> list = transactionDao.getList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

}
