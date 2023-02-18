package com.dphone.referral.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dphone.referral.entity.Referral;


@Repository
public interface ReferralDao extends JpaRepository<Referral, Integer>{

	
//	@Query("select referral from Referral referral where referral.userId=?1")
//	List<Referral> userReferralList(int userId);
//	
//	
//	@Query("select referral from Referral where referral referral.referralCode=?1 and referral.firstName=?2 and referral.lastName=?3")
//	List<Referral> redeemReferral(String referralCode, String firstName, String lastName);
}
