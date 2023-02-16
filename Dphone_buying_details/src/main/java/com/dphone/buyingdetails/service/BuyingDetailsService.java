package com.dphone.buyingdetails.service;

import com.dphone.buyingdetails.bean.BuyingDetailsBean;
import com.dphone.buyingdetails.entity.BuyingDetailsEntity;

public interface BuyingDetailsService {

	BuyingDetailsEntity addProduct(BuyingDetailsBean buyingDetailsBean);
	
	BuyingDetailsEntity showProduct(long customer_id);
	
	String deleteProduct(long customer_id);
}
