package com.dphone.customer.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dphone.customer.feign.bean.CustomerBean;
import com.dphone.customer.feign.client.CustomerClient;

@RestController
public class CustomerClientController {
	
	@Autowired
	CustomerClient customerClient;
	

	@GetMapping(value = "customer/showCustomer/{customer_id}")
	public ResponseEntity<CustomerBean> showCustomer(@PathVariable("customer_id") Long customer_id) {
		ResponseEntity<CustomerBean> customerBean=customerClient.showCustomer(customer_id);
		return customerBean;
	}
}
