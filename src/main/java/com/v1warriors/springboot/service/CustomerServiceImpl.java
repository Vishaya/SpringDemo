package com.v1warriors.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v1warriors.springboot.entity.Customer;
import com.v1warriors.springboot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

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
		System.out.println("Reading all cutomers from database");
		return customerRepository.findAll();

	}

	@Override
	public Customer getCustomerById(String customerId) {
		Optional<Customer> optionalUser = customerRepository.findById(customerId);
		return optionalUser.get();
	}
	
	@Override
	public Customer updateCustomerById(Customer customer) {
		Optional<Customer> existingCustomer= customerRepository.findById(customer.getCustomerId());
		//To-Do
		return existingCustomer.get();
	}
	
	@Override
    public String deleteCustomerById(String customerId)
    {
		customerRepository.deleteById(customerId);
        return "Deleted Successfully";
    }
}
