package com.adkrive.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Advertiser;

@Repository
public interface AdvertiserRepository extends JpaRepository<Advertiser, Integer>{

	@Query("SELECT a FROM Advertiser a WHERE status=1")
	public List<Advertiser> getAllActiveAdvertiser();

	@Query("SELECT a FROM Advertiser a WHERE status=2")
	public List<Advertiser> getAllBannedAdvertiser();

	@Query("SELECT a FROM Advertiser a WHERE ev=1")
	public List<Advertiser> getAllEmailUnverifiedAdvertiser();

	@Query("SELECT a FROM Advertiser a WHERE sv=1")
	public List<Advertiser> getAllSmslUnverifiedAdvertiser();

	@Query(value = "SELECT a FROM Advertiser a WHERE a.name= ?1 OR a.email = ?1")
	public List<Advertiser> searchAdvertiserByNameOrEmail(String value);
}
