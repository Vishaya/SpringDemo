package com.v1warriors.springbootproject;

import java.util.List;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	List<Customer> readCustomer();
	
	
}
