package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.PublisherEarningLog;

@Repository
public interface PubEarnLogrepository extends JpaRepository<PublisherEarningLog, Integer>{

	
}






