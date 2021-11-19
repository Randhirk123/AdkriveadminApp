package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Advertise;

@Repository
public interface AdvertiseRepository extends JpaRepository<Advertise, Integer> {

}
