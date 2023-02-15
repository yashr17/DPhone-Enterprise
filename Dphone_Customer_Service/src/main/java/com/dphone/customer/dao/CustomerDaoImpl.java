package com.dphone.customer.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.entity.CustomerEntity;
import com.dphone.customer.service.CustomerService;


@Service
public class CustomerDaoImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public CustomerEntity addCustomer(CustomerBean customerBean) {
		CustomerEntity customerEntity=new CustomerEntity();
		System.out.println("Dao bean "+customerBean);
		BeanUtils.copyProperties(customerBean, customerEntity);
		return customerDao.save(customerEntity);
	}
	
	

	@Override
	public CustomerEntity showCustomer(long customerId) {
		// TODO Auto-generated method stub
		return customerDao.findById(customerId).get();
	}



	@Override
	public String deleteCustomer(long customer_id) {
		// TODO Auto-generated method stub
		String messString;
		if(customerDao.existsById(customer_id)) {
			customerDao.deleteById(customer_id);
			messString=customer_id+" deleted Successfully";
		}
		else {
			messString=customer_id+" not Present";
		}
		return messString;
	}



	@Override
	public CustomerBean updateCustomer(Long customer_id, CustomerBean customerBean) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity=new CustomerEntity();
		BeanUtils.copyProperties(customerBean, customerEntity);
		customerDao.save(customerEntity);
		return customerBean;
		
	}
	
}
