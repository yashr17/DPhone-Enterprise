package com.dphone.referral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dphone.referral.bean.ReferralBean;
import com.dphone.referral.service.ReferralServiceImpl;


@RestController
@RequestMapping("/referral")
public class ReferralController {
	
	@Autowired
	ReferralServiceImpl referralServiceImpl;
	
	@PostMapping("/new")
	public ResponseEntity<Boolean> createReferral(@RequestBody ReferralBean referralBean) {
		boolean status = referralServiceImpl.createReferral(referralBean);
		return new ResponseEntity<Boolean>(status, HttpStatus.CREATED);
	}
	
	@GetMapping("/list/{userId}")
	public ResponseEntity<List<ReferralBean>> viewReferral(@PathVariable int userId){
		List<ReferralBean> list = referralServiceImpl.viewReferral(userId);
		
		if(list.isEmpty()) return new ResponseEntity<List<ReferralBean>>(list, HttpStatus.BAD_REQUEST);
		else return new ResponseEntity<List<ReferralBean>>(list, HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/delete/{referral_Id}")
	public ResponseEntity<Boolean> deleteReferral(@PathVariable("referral_Id") int referral_Id){
		
		boolean status = referralServiceImpl.deleteReferral(referral_Id);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateReferral(@RequestBody ReferralBean referralBean){
		
		boolean status = referralServiceImpl.updateReferral(referralBean);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	
	@GetMapping("/redeem/{referral_code}")
	public ResponseEntity<Double> redeemReferral(@PathVariable String referral_code){
		double points = referralServiceImpl.redeemReferral(referral_code);
		return new ResponseEntity<Double>(points, HttpStatus.FOUND);
	}
	
}

