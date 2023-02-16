package com.dphone.referral.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dphone.referral.controller.ReferralBean;
import com.dphone.referral.entity.Referral;

@Repository
public interface ReferralServiceInterface {
	
	 boolean createReferral(ReferralBean referralBean);
	
	 List<ReferralBean> viewReferral(int userId);
	 
	 boolean deleteReferral(int referralId);
	 
	 boolean updateReferral(ReferralBean referralBean);
	 
}
