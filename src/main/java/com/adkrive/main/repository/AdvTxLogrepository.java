package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.AdvTransactionLog;

@Repository
public interface AdvTxLogrepository extends JpaRepository<AdvTransactionLog,Long>{

	
}
