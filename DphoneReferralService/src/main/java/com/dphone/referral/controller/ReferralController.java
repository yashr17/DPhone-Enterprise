package com.dphone.referral.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dphone.referral.service.ReferralServiceClass;

@RestController
@RequestMapping("/referral")
public class ReferralController {
	
	@Autowired
	ReferralServiceClass referralServiceClass;
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ResponseEntity<Boolean> createReferral(@RequestBody ReferralBean referralBean) {
		boolean status = referralServiceClass.createReferral(referralBean);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ResponseEntity<List<ReferralBean>> viewReferral(@PathVariable int userId){
		List<ReferralBean> list = referralServiceClass.viewReferral(userId);
		
		if(list.isEmpty()) return new ResponseEntity<List<ReferralBean>>(list, HttpStatus.BAD_REQUEST);
		else return new ResponseEntity<List<ReferralBean>>(list, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteReferral(@PathVariable("referralId") int referralId){
		
		boolean status = referralServiceClass.deleteReferral(referralId);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<Boolean> updateReferral(@RequestBody ReferralBean referralBean){
		
		boolean status = referralServiceClass.updateReferral(referralBean);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	
}
