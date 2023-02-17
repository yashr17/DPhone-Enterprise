package com.dphone.customer.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.dphone.customer.feign.bean.CustomerBean;

@FeignClient(url = "http://localhost:8081/customer/", name = "CUSTOMER-SERVICE")
public interface CustomerClient {

	@GetMapping(value = "/showCustomer/{customer_id}")
	public ResponseEntity<CustomerBean> showCustomer(long customer_id);
}
