package com.dphone.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.dao.CustomerDaoImpl;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDaoImpl customerDaoImpl;

	@Override
	public boolean addCustomer(CustomerBean customerBean) {
		// TODO Auto-generated method stub
		return customerDaoImpl.addCustomer(customerBean);
	}

	@Override
	public CustomerBean showCustomer(long customer_id) {
		// TODO Auto-generated method stub
		return customerDaoImpl.showCustomer(customer_id);
	}
	
	
	
}
