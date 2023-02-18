package com.dphone.referral.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dphone.referral.bean.ReferralBean;
import com.dphone.referral.dao.ReferralDao;
import com.dphone.referral.entity.ReferralEntity;

@Service
public class ReferralServiceImpl implements ReferralService{

	@Autowired
	ReferralDao referralDao;
	
	@Override
	public boolean createReferral(ReferralBean referralBean) {
		
		String uniqueString = UUID.randomUUID().toString();
		
		ReferralEntity referralEntity = new ReferralEntity();
		BeanUtils.copyProperties(referralBean, referralEntity);
		referralEntity.setReferral_code(uniqueString);
		
		try{
			referralDao.save(referralEntity);
		}
		catch(IllegalArgumentException e) {
			return false;
		}
		return true;
	}

	@Override
	public List<ReferralBean> viewReferral(int userId){
		
		List<ReferralEntity> referralList = referralDao.findByUserId(userId);
		List<ReferralBean> referralBeanList = new ArrayList<>();
		
		for(ReferralEntity referralEntity : referralList) {
			ReferralBean referralBean = new ReferralBean();
			BeanUtils.copyProperties(referralEntity, referralBean);
			referralBeanList.add(referralBean);
		}
		return referralBeanList;
		
	}

	@Override
	public boolean deleteReferral(int referral_Id) {
		
		boolean status = true;
		try {
			Optional<ReferralEntity> referralEntity = referralDao.findById(referral_Id);
			referralDao.deleteById(referral_Id);
			if(referralEntity==null) status = false;
		}
		catch(IllegalArgumentException e) {
			return false;
		}
		
		return status;
	}

	@Override
	public boolean updateReferral(ReferralBean referralBean) {
		
		try {
			Optional<ReferralEntity> referralEntity = referralDao.findById(referralBean.getReferral_id());
			if(referralEntity==null) return false;
		}
		catch(IllegalArgumentException e) {
			return false;
		}
		
		ReferralEntity referralEntity = new ReferralEntity();
		BeanUtils.copyProperties(referralBean, referralEntity);
		referralDao.save(referralEntity);
		
		return true;
	}

	@Override
	public double redeemReferral(String referral_code) {
		double points = 0;
		
		ReferralEntity referralEntity = referralDao.findByReferral_code(referral_code);
		referralEntity.setStatus(true);
		referralDao.save(referralEntity);
		return points;

	}

	
	public Optional<ReferralEntity> getReferral(int referral_Id) {
		return referralDao.findById(referral_Id);
	}

}
