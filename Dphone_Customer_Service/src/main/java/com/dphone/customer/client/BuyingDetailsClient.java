package com.dphone.customer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dphone.customer.bean.BuyingDetailsBean;



@FeignClient(url = "http://localhost:8084/product", name = "BUYING-DETAIL-SERVICE")
public interface BuyingDetailsClient {

	@PostMapping(value = "/addProduct")
	public Boolean addProduct(@RequestBody BuyingDetailsBean buyingDetailsBean);
}
