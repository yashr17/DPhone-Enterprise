package com.dphone.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dphone.customer.entity.CustomerEntity;


public interface CustomerDao extends JpaRepository<CustomerEntity, Long>{

}
