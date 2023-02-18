package com.dphone.referral.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.dphone.referral.entity.ReferralEntity;

public interface ReferralDao extends JpaRepository<ReferralEntity, Integer>{


	List<ReferralEntity> findByUserId(int referral_Id);
	
	@Query("SELECT r FROM ReferralEntity r WHERE r.referral_code = ?1")
	ReferralEntity findByReferral_code(String referral_code);

}