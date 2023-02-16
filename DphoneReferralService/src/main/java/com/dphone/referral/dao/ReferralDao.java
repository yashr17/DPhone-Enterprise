package com.dphone.referral.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dphone.referral.entity.Referral;


@Repository
public interface ReferralDao extends JpaRepository<Referral, Integer>{

	
	@Query("select referral from Referral referral where referral.userId=?")
	List<Referral> userReferralList();
	
}
