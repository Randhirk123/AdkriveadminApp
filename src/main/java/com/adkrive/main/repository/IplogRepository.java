package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.IpLog;

@Repository
public interface IplogRepository extends JpaRepository<IpLog, Integer> {

}
