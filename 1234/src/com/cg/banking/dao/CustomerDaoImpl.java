package com.cg.banking.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.banking.dto.Customer;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{
	@PersistenceContext
	EntityManager entityManager;
	public CustomerDaoImpl() {
		super();
	}
	public CustomerDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public Customer findPanNumber(String panCardNumber) {
	        return entityManager.find(Customer.class, panCardNumber);
	}

}
