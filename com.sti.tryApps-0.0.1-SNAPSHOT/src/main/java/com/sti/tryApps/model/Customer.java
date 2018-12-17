package com.sti.tryApps.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customernumber")
	private int customernumber;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "birthdate")
	private Date birthdate;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "phonetype")
	private String phonetype;
	@Column(name = "phonenumber")
	private String phonenumber;

	
	
	public int getCustomernumber() {
		return customernumber;
	}



	public void setCustomernumber(int customernumber) {
		this.customernumber = customernumber;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Date getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getPhonetype() {
		return phonetype;
	}



	public void setPhonetype(String phonetype) {
		this.phonetype = phonetype;
	}



	public String getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}



	public Customer(int customernumber, String username, String password, Date birthdate, String firstname, String lastname, String phonetype, String phonenumber) {
        this.customernumber = customernumber;
        this.username = username;
        this.password = password;
        this.birthdate = birthdate;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
	}
	
	public Customer() {
		
	}


}