package com.dphone.buyingdetails.dao;

import com.dphone.buyingdetails.bean.BuyingDetailsBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dphone.buyingdetails.entity.BuyingDetailsEntity;
import com.dphone.buyingdetails.service.BuyingDetailsService;


@Service
public class BuyingDetailsDaoImpl implements BuyingDetailsService {

	@Autowired
	private BuyingDetailsDao buyingDetailsDao;
	
	@Override
	public BuyingDetailsEntity addProduct(BuyingDetailsBean buyingDetailsBean) {
		BuyingDetailsEntity buyingDetailsEntity =new BuyingDetailsEntity();
		System.out.println("Dao bean "+ buyingDetailsBean);
		BeanUtils.copyProperties(buyingDetailsBean, buyingDetailsEntity);
		return buyingDetailsDao.save(buyingDetailsEntity);
	}
	
	

	@Override
	public BuyingDetailsEntity showProduct(long customerId) {
		// TODO Auto-generated method stub
		return buyingDetailsDao.findById(customerId).get();
	}



	@Override
	public String deleteProduct(long customer_id) {
		// TODO Auto-generated method stub
		String messString;
		if(buyingDetailsDao.existsById(customer_id)) {
			buyingDetailsDao.deleteById(customer_id);
			messString=customer_id+" deleted Successfully";
		}
		else {
			messString=customer_id+" not Present";
		}
		return messString;
	}
	
}
