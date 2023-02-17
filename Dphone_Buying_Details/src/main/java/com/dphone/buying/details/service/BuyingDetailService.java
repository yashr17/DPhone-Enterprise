package com.dphone.buying.details.service;

import com.dphone.buying.details.bean.BuyingDetailsBean;

public interface BuyingDetailService {

	boolean addProduct(BuyingDetailsBean buyingDetailsBean);
	
	BuyingDetailsBean showProduct(long customer_id);
	
	boolean deleteProduct(long customer_id);
	
	boolean updateProduct(BuyingDetailsBean buyingDetailsBean);
}
