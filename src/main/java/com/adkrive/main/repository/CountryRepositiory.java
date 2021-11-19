package com.adkrive.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Country;

@Repository
public interface CountryRepositiory extends JpaRepository<Country, Long>{

	
}
