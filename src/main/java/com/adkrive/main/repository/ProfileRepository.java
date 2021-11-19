package com.adkrive.main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.adkrive.main.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	public Profile findByEmail(String email);

	@Transactional
	@Modifying
	@Query("update Profile p SET p.name =:name, p.email =:email,p.image=:image")
	Integer updateProfile(@Param(value = "name") String name, @Param(value = "email") String email,@Param(value = "image") byte[] image);
	
	@Query("SELECT p FROM Profile p")
	public Profile getAllDetails();
	

}
