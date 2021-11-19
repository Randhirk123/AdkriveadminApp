package com.adkrive.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Publisher;
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

	@Query("SELECT p FROM Publisher p WHERE status=1")
	public List<Publisher> getAllActivePublisher();

	@Query("SELECT p FROM Publisher p WHERE status=2")
	public List<Publisher> getAllBannedPublisher();

	@Query("SELECT p FROM Publisher p WHERE ev=1")
	public List<Publisher> getAllEmailUnverifiedPublisher();

	@Query("SELECT p FROM Publisher p WHERE sv=1")
	public List<Publisher> getAllSmslUnverifiedPublisher();

	@Query(value = "SELECT p FROM Publisher p WHERE p.name= ?1 OR p.email = ?1")
	public List<Publisher> searchPublisherByNameOrEmail(String value);

}
