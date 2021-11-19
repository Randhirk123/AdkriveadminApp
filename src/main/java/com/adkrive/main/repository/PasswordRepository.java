package com.adkrive.main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Password;

@Repository
public interface PasswordRepository extends JpaRepository<Password, Long> {

	@Query("SELECT p FROM Password p")
	public Password getPassWordDetails();
	
	@Transactional
	@Modifying
	@Query("update Password p SET p.email =:email")
	void updatePassWord(@Param(value = "email") String email);
}
