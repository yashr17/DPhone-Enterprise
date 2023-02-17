package com.dphone.buying.details.dao;

import com.dphone.buying.details.entity.BuyingDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyingDetailDao extends JpaRepository<BuyingDetailEntity, Long>{
}
