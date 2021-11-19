package com.adkrive.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.UserLoginHistory;

@Repository
public interface UserLoginHistoryRepository extends JpaRepository<UserLoginHistory, Long> {

	/*
	 * @Query(nativeQuery = true, value =
	 * "select p.*, o.name as organisation_name from person " +
	 * "p left join organisation o on p.organisation_guid = o.guid")
	 * List<UserLoginHistory> findAll();
	 */
	
	 @Query(value = "select u from UserLoginHistory u where u.publisher_id = :pid")
	 
	 public List<UserLoginHistory> getAllPublisherLog(@Param(value = "pid") Integer pid);
	 
	 @Query(value = "select u from UserLoginHistory u where u.user_ip = :ip")
	 
	 public List<UserLoginHistory> getAllPublisherHistoryIpLog(@Param(value = "ip") String ip);

	 @Query(value = "select u from UserLoginHistory u where u.advertiser_id = :aid")
	public List<UserLoginHistory> getAllAdvertiserLog(Integer aid);

	 @Query(value = "select u from UserLoginHistory u where u.user_ip = :ip")
	public List<UserLoginHistory> getAllAdvertiserIpLog(String ip);
}
