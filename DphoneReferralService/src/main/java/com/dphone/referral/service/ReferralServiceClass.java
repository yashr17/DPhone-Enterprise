package com.dphone.referral.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dphone.referral.controller.ReferralBean;
import com.dphone.referral.dao.ReferralDao;
import com.dphone.referral.entity.Referral;


@Service
public class ReferralServiceClass implements ReferralServiceInterface {

	@Autowired
	ReferralDao referralDao;
	
	@Override
	public boolean createReferral(ReferralBean referralBean) {
		
		String uniqueString = UUID.randomUUID().toString();
		
		Referral referral = new Referral();
		BeanUtils.copyProperties(referralBean, referral);
		referral.setReferralCode(uniqueString);
		
		try{
			referralDao.save(referral);
		}
		catch(IllegalArgumentException e) {
			return false;
		}
		return true;
	}

	@Override
	public List<ReferralBean> viewReferral(int userId){
		
//		List<Referral> referralList = referralDao.userReferralList(userId);
		List<ReferralBean> referralBeanList = new ArrayList<>();
//		
//		for(Referral referral : referralList) {
//			ReferralBean referralBean = new ReferralBean();
//			BeanUtils.copyProperties(referral, referralBean);
//			referralBeanList.add(referralBean);
//		}
		return referralBeanList;
		
	}

	@Override
	public boolean deleteReferral(int referralId) {
		
		boolean status = true;
		try {
			Optional<Referral> referral = referralDao.findById(referralId);
			referralDao.deleteById(referralId);
			if(referral==null) status = false;
		}
		catch(IllegalArgumentException e) {
			return false;
		}
		
		return status;
	}

	@Override
	public boolean updateReferral(ReferralBean referralBean) {
		
		try {
			Optional<Referral> referral = referralDao.findById(referralBean.getReferralId());
			if(referral==null) return false;
		}
		catch(IllegalArgumentException e) {
			return false;
		}
		
		Referral referral = new Referral();
		BeanUtils.copyProperties(referralBean, referral);
		referralDao.save(referral);
		
		return true;
	}

	@Override
	public double redeemReferral(String referralCode, String firstName, String LastName) {
		
//		List<Referral> list = referralDao.redeemReferral(referralCode, firstName, LastName);
//		if(list.isEmpty()) return 0;
//		
//		else {
//			
//			Referral referral = list.get(0);
//			ReferralBean referralBean = new ReferralBean();
//			BeanUtils.copyProperties(referral, referralBean);
//			referralBean.setStatus(false);
//			
//			updateReferral(referralBean);
//			
//			return 500;
//		}
		return 0;
	}
	
	
	
}
