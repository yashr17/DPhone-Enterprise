package com.dphone.buying.details.service;

import com.dphone.buying.details.bean.BuyingDetailsBean;
import com.dphone.buying.details.dao.BuyingDetailDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyingDetailServiceImpl implements BuyingDetailService {

	@Autowired
	private BuyingDetailDaoImpl buyingDetailDaoImpl;

	@Override
	public boolean addProduct(BuyingDetailsBean buyingDetailsBean) {
		// TODO Auto-generated method stub
		return buyingDetailDaoImpl.addProduct(buyingDetailsBean);
	}

	@Override
	public BuyingDetailsBean showProduct(long customer_id) {
		// TODO Auto-generated method stub
		return buyingDetailDaoImpl.showProuct(customer_id);
	}

	@Override
	public boolean deleteProduct(long customer_id) {
		// TODO Auto-generated method stub
		return buyingDetailDaoImpl.deleteProduct(customer_id);
	}

	@Override
	public boolean updateProduct(BuyingDetailsBean buyingDetailsBean) {
		// TODO Auto-generated method stub
		return buyingDetailDaoImpl.updateProduct(buyingDetailsBean);
	}
	
	
	
}
