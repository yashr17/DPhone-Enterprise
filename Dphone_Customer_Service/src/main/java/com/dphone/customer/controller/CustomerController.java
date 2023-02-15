package com.dphone.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(value="showCustomer/{customer_id}")
	public ResponseEntity<CustomerEntity> showCustomer(@PathVariable("customer_id") Long customer_id){
		CustomerEntity showCustomerEntity=customerDaoImpl.showCustomer(customer_id);
		return ResponseEntity.ok(showCustomerEntity);
	}
	
	@DeleteMapping(value = "/deleteCustomer/{customer_id}")
	public ResponseEntity<String> deletCustomer(@PathVariable("customer_id") Long customer_id){
		customerDaoImpl.deleteCustomer(customer_id);
		return new ResponseEntity<String>("Employee Deleted Successfully",HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateCustomer/{customer_id}")
	public ResponseEntity<CustomerBean> updateCustomer(@PathVariable("customer_id") Long customer_id,@RequestBody CustomerBean customerBean){
		CustomerBean customerBean2= customerDaoImpl.updateCustomer(customer_id, customerBean);
		return  new ResponseEntity<CustomerBean>(customerBean2,HttpStatus.OK);
		
	}
}
