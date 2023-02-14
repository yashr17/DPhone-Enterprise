package com.dphone.buyingdetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dphone.buyingdetails.entity.CustomerEntity;


public interface CustomerDao extends JpaRepository<CustomerEntity, Long>{

}
