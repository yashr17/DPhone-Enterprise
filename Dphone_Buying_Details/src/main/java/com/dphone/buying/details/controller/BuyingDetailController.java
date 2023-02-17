package com.dphone.buying.details.controller;

import com.dphone.buying.details.bean.BuyingDetailsBean;
import com.dphone.buying.details.service.BuyingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/product/")
@RestController
public class BuyingDetailController {

	@Autowired 
	private BuyingDetailService buyingDetailService;
	
	@PostMapping(value = "/addProduct")
	public ResponseEntity<Boolean> addProduct(@RequestBody BuyingDetailsBean buyingDetailsBean){
		boolean status= buyingDetailService.addProduct(buyingDetailsBean);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
	@GetMapping(value = "/showProduct/{customer_id}")
	public ResponseEntity<BuyingDetailsBean> showProduct(@PathVariable("customer_id") Long customer_id){
		BuyingDetailsBean buyingDetailsBean = buyingDetailService.showProduct(customer_id);
		return new ResponseEntity<BuyingDetailsBean>(buyingDetailsBean,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteProduct/{customer_id}")
	public ResponseEntity<Boolean> deleteProduct(@PathVariable("customer_id") Long customer_id){
		boolean status= buyingDetailService.deleteProduct(customer_id);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateProduct")
	public ResponseEntity<Boolean> updateProduct(@RequestBody BuyingDetailsBean buyingDetailsBean){
		boolean status= buyingDetailService.updateProduct(buyingDetailsBean);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
}
