package com.dphone.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dphone.customer.entity.CustomerEntity;

@Repository
public interface CustomerDao extends JpaRepository<CustomerEntity, Long>{
}
