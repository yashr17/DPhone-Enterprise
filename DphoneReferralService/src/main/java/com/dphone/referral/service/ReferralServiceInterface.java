package com.dphone.referral.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dphone.referral.controller.ReferralBean;
import com.dphone.referral.entity.Referral;

@Service
public interface ReferralServiceInterface {
	
	 boolean createReferral(ReferralBean referralBean);
	
	 List<ReferralBean> viewReferral(int userId);
	 
	 boolean deleteReferral(int referralId);
	 
	 boolean updateReferral(ReferralBean referralBean);
	 
	 double redeemReferral(String referralCode, String firstName, String LastName);
	 
}
