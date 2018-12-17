package com.sti.tryApps.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="accountnumber")
	private int accountnumber;
	@Column(name="opendate")
	private Date opendate;
	@Column(name="balance")
	private int balance;
	@Column(name="customernum")
	private int customernum;
	
	public Account(int accountnumber, Date opendate, int balance, int customernum) {
		this.accountnumber=accountnumber;
		this.opendate=opendate;
		this.balance=balance;
		this.customernum=customernum;
	}
	
	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public Date getOpendate() {
		return opendate;
	}

	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCustomernum() {
		return customernum;
	}

	public void setCustomernum(int customernum) {
		this.customernum = customernum;
	}

	public Account() {
		
	}
}
