package com.adkrive.main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	@Query("SELECT e FROM Admin e WHERE e.email = ?1")
	public Admin findByEmail(String email);

	public Admin findByResetPasswordToken(String token);
	public Admin findByImage(byte[] image);

	@Query("SELECT a FROM Admin a")
	public Admin getAllDetails();

	
	@Query("SELECT a  FROM Admin a WHERE a.userName=?1")
	public Admin findByUserNameAndPassword(String userName);
	@Transactional
	@Modifying
	@Query("update Admin a SET a.name =:name, a.email =:email,a.image=:image")
	void updateAdmin(@Param(value = "name") String name, @Param(value = "email") String email,@Param(value = "image") byte[] image);

}
