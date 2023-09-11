package com.v1warriors.springboot.service;

import java.util.List;

import com.v1warriors.springboot.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	List<Customer> readCustomer();

	Customer getCustomerById(String customerId);

	Customer updateCustomerById(Customer customer);

	String deleteCustomerById(String customerId);

}
