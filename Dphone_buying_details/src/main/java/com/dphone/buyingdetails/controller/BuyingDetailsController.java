package com.dphone.buyingdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dphone.buyingdetails.bean.BuyingDetailsBean;
import com.dphone.buyingdetails.dao.BuyingDetailsDaoImpl;
import com.dphone.buyingdetails.entity.BuyingDetailsEntity;

@RestController
@RequestMapping("/products/")

public class BuyingDetailsController {

	@Autowired
	private BuyingDetailsDaoImpl buyingDetailsDaoImpl;
	

	@PostMapping(value = "/addProduct")
	public ResponseEntity<BuyingDetailsEntity> addProduct(@RequestBody BuyingDetailsBean buyingDetailsBean){
		System.out.println("Controller bean "+ buyingDetailsBean);
		BuyingDetailsEntity addedBuyingDetailsEntity = buyingDetailsDaoImpl.addProduct(buyingDetailsBean);
		return new ResponseEntity<>(addedBuyingDetailsEntity,HttpStatus.CREATED);
	}
	
	@GetMapping(value="showProduct/{customer_id}")
	public ResponseEntity<BuyingDetailsEntity> showProduct(@PathVariable("customer_id") Long customer_id){
		BuyingDetailsEntity showBuyingDetailsEntity = buyingDetailsDaoImpl.showProduct(customer_id);
		return ResponseEntity.ok(showBuyingDetailsEntity);
	}
	
	@DeleteMapping(value = "/deleteProduct/{customer_id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("customer_id") Long customer_id){
		buyingDetailsDaoImpl.deleteProduct(customer_id);
		return new ResponseEntity<String>("Employee Deleted Successfully",HttpStatus.OK);
	}
}
