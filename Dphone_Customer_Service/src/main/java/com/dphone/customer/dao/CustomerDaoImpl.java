package com.dphone.customer.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.entity.CustomerEntity;

public class CustomerDaoImpl {

	@Autowired
	public CustomerDao customerDao;
	
	public boolean addCustomer(CustomerBean customerBean) {
		CustomerEntity customerEntity=new CustomerEntity();
		BeanUtils.copyProperties(customerBean, customerEntity);
		try {
			customerDao.save(customerEntity);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
	
}
