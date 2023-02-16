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
	
	public CustomerBean showCustomer(long customer_id) {
		
		
		try {
			CustomerEntity customerEntity=customerDao.getReferenceById(customer_id);
			CustomerBean customerBean=new CustomerBean();
			BeanUtils.copyProperties(customerEntity, customerBean);
			return customerBean;
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return null;
		}
	}
	
	
}
