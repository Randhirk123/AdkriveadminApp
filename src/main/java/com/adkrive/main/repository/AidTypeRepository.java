package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.AdType;

@Repository
public interface AidTypeRepository extends JpaRepository<AdType,Integer> {

}
