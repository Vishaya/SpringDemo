package com.v1warriors.springbootproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		return customerRepository.save(customer);
		
	}

	
	@Override
	public List<Customer> readCustomer() {
		// TODO Auto-generated method stub
		
		return customerRepository.findAll();
		
	}
}
