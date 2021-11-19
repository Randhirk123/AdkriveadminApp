package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.PricePlan;

@Repository
public interface PricePlanRepository extends JpaRepository<PricePlan, Integer> {

	
}
