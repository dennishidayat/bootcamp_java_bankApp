package com.sti.tryApps.dao.Impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.sti.tryApps.dao.TransactionDao;
import com.sti.tryApps.dao.repository.TransactionRepository;
import com.sti.tryApps.model.Transaction;

public class TransactionDaoImpl extends BaseImpl implements TransactionDao {
	
	@Autowired
	private TransactionRepository repository;

	@Override
	public Transaction getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Transaction save(Transaction CustData) throws Exception {
		return repository.save(CustData);
	}

	@Override
	public void delete(Transaction CustData) throws Exception {
		repository.delete(CustData);
	}

	@Override
	public List<Transaction> getList() throws Exception {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Transaction> query = critB.createQuery(Transaction.class);
		Root<Transaction> root = query.from(Transaction.class);
		query.select(root);
		
		TypedQuery<Transaction> i = em.createQuery(query);
		
		return i.getResultList();
	}

}
