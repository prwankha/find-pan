package com.cg.banking.dao;

import com.cg.banking.dto.Customer;

public interface CustomerDao {
	Customer findPanNumber(String panCardNumber);
}
