package com.dphone.buyingdetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dphone.buyingdetails.entity.BuyingDetailsEntity;


public interface BuyingDetailsDao extends JpaRepository<BuyingDetailsEntity, Long>{

}
