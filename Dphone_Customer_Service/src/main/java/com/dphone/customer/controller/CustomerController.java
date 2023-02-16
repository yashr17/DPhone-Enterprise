package com.dphone.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.service.CustomerService;

@RequestMapping("/customer/")
@RestController
public class CustomerController{

	@Autowired 
	private CustomerService customerService;
	
	@PostMapping(value = "/addCustomer")
	public ResponseEntity<Boolean> addCustomer(@RequestBody CustomerBean customerBean){
		boolean status=customerService.addCustomer(customerBean);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
}
