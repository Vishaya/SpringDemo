package com.v1warriors.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.v1warriors.springboot.entity.Customer;
import com.v1warriors.springboot.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/get-customers")
	public ResponseEntity<List<Customer>> fetchAllCustomers() {

		List<Customer> customers = customerService.readCustomer();
		return new ResponseEntity<>(customers, HttpStatus.OK);
	}

	@GetMapping("/get-customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
	@PostMapping("/new-customer")
    public ResponseEntity<Customer> createUser(@RequestBody Customer customer){
		Customer newUser = customerService.createCustomer(customer);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

	@PutMapping("/get-customer/{id}")
	public ResponseEntity<Customer> updateCustomerById(@RequestBody Customer customer) {
		Customer updatedCustomer = customerService.updateCustomerById(customer);
		return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-customer/{id}")
    public String deleteCustomerById(@PathVariable("id") String customerId)
    {
		customerService.deleteCustomerById(customerId);
        return "Deleted Successfully";
    }
}
