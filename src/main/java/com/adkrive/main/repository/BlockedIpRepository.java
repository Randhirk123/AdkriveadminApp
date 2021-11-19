package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.BlockedIpLog;

@Repository
public interface BlockedIpRepository extends JpaRepository<BlockedIpLog, Integer>{

}
