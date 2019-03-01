package com.cg.banking.services;

import com.cg.banking.dto.Customer;

public interface BankingService {
	Customer findPanNumber(String panNumber);
}
