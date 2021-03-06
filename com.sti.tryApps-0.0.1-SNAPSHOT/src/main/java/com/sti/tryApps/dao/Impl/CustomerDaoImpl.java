package com.sti.tryApps.dao.Impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.sti.tryApps.model.Customer;
import com.sti.tryApps.dao.CustomerDao;
import com.sti.tryApps.dao.repository.CustomerRepository;

public class CustomerDaoImpl extends BaseImpl implements CustomerDao {

	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer getById(int id) throws Exception {
		return repository.findOne(id);
	}
	
	@Override
	public Customer save(Customer CustData) throws Exception {
		return repository.save(CustData);
	}
	
	@Override
	public void delete(Customer CustData) throws Exception {
		repository.delete(CustData);
	}

	@Override
	public List<Customer> getList() throws Exception {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Customer> query = critB.createQuery(Customer.class);
		Root<Customer> root = query.from(Customer.class);
		query.select(root);
		
		TypedQuery<Customer> i = em.createQuery(query);
		
		return i.getResultList();
	}
}
