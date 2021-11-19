package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.PmntGtway;

@Repository
public interface PmntGatewayRepository extends JpaRepository<PmntGtway,Integer> {

	@Query("SELECT p  FROM PmntGtway p WHERE p.name=?1")
	public PmntGtway findbyName(String name);
}
