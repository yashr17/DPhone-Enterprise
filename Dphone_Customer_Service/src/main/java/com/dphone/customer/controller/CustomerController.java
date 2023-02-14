package com.dphone.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.dao.CustomerDaoImpl;
import com.dphone.customer.entity.CustomerEntity;



@RestController
@RequestMapping("/customer/")

public class CustomerController {

	@Autowired
	private CustomerDaoImpl customerDaoImpl;
	

	@PostMapping(value = "/addCustomer")
	public ResponseEntity<CustomerEntity> addCustomer(@RequestBody CustomerBean customerBean){
		System.out.println("Controller bean "+customerBean);
		CustomerEntity addedCustomerEntity= customerDaoImpl.addCustomer(customerBean);
		return new ResponseEntity<>(addedCustomerEntity,HttpStatus.CREATED);
	}
	
	@GetMapping(value="showCustomer/{customerId}")
	public ResponseEntity<CustomerEntity> showCustomer(@PathVariable("customerId") Long customerId){
		CustomerEntity showCustomerEntity=customerDaoImpl.showCustomer(customerId);
		return ResponseEntity.ok(showCustomerEntity);
	}
}
