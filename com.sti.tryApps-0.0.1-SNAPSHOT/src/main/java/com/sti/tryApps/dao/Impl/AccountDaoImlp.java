package com.sti.tryApps.dao.Impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.sti.tryApps.dao.AccountDao;
import com.sti.tryApps.dao.repository.AccountRepository;
import com.sti.tryApps.model.Account;

public class AccountDaoImlp extends BaseImpl implements AccountDao{
	@Autowired
	private AccountRepository repository;

	@Override
	public Account getById(int id) throws Exception {
		return repository.findOne(id);
	}

	@Override
	public Account save(Account CustData) throws Exception {
		return repository.save(CustData);
	}

	@Override
	public void delete(Account CustData) throws Exception {
		// TODO Auto-generated method stub
		repository.delete(CustData);
	}

	@Override
	public List<Account> getList() throws Exception {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Account> query = critB.createQuery(Account.class);
		Root<Account> root = query.from(Account.class);
		query.select(root);
		
		TypedQuery<Account> i = em.createQuery(query);
		
		return i.getResultList();
	}

}
