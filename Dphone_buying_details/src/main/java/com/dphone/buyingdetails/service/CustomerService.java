package com.dphone.buyingdetails.service;

import com.dphone.buyingdetails.bean.CustomerBean;
import com.dphone.buyingdetails.entity.CustomerEntity;

public interface CustomerService {

	CustomerEntity addCustomer(CustomerBean customerBean);
	
	CustomerEntity showCustomer(long customer_id);
	
	String deleteCustomer(long customer_id);
}
