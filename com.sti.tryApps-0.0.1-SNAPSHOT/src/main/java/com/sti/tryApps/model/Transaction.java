package com.sti.tryApps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="id")
	private int id;
	@Column(name="type")
	private String type;
	@Column(name="amount")
	private int amount;
	@Column(name="amountsign")
	private String amSign;
	@Column(name="accountnum")
	private int accNumber;

	
	public Transaction (int id, int amount, int accNumber, String type, String amSign) {
		this.id=id;
		this.amount=amount;
		this.accNumber=accNumber;
		this.type=type;
		this.amSign=amSign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmSign() {
		return amSign;
	}

	public void setAmSign(String amSign) {
		this.amSign = amSign;
	}
	
	public Transaction() {
		
	}

}
