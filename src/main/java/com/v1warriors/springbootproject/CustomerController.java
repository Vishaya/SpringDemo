package com.v1warriors.springbootproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/get-customers")
	public List<Customer> fetchAllCustomers() {

		return customerService.readCustomer();
	}

}
