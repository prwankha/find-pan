package com.cg.banking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.banking.dao.CustomerDao;
import com.cg.banking.dto.Customer;
@Service
public class BankingServiceImpl implements BankingService{
	@Autowired
	private CustomerDao customerDao;
	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public BankingServiceImpl() {
		super();
	}
	@Override
	public Customer findPanNumber(String panNumber){
		return customerDao.findPanNumber(panNumber);
		
	}

}
