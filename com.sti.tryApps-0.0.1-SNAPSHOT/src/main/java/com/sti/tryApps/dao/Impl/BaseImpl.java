package com.sti.tryApps.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

public class BaseImpl {
	@PersistenceContext
	protected EntityManager em;
	@PersistenceUnit
	protected EntityManagerFactory emf;

}