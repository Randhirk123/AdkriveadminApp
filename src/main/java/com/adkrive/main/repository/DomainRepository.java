package com.adkrive.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Domain;

@Repository
public interface DomainRepository extends JpaRepository<Domain, Integer>{

	@Query("SELECT d FROM Domain d WHERE status=2")
	public List<Domain> getAllPendingDomain();
	
	
}
