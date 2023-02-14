package com.dphone.customer.service;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.entity.CustomerEntity;

public interface CustomerService {

	CustomerEntity addCustomer(CustomerBean customerBean);
	
	CustomerEntity showCustomer(long customerId);
}
