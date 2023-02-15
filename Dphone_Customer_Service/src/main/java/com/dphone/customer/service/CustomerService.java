package com.dphone.customer.service;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.entity.CustomerEntity;

public interface CustomerService {

	CustomerEntity addCustomer(CustomerBean customerBean);
	
	CustomerEntity showCustomer(long customer_id);
	
	String deleteCustomer(long customer_id);
	
	CustomerBean updateCustomer(Long customer_id,CustomerBean customerBean);
}
