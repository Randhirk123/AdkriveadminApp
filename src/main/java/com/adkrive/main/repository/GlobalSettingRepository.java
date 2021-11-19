package com.adkrive.main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.GlobalSetting;

@Repository
public interface GlobalSettingRepository extends JpaRepository<GlobalSetting, Integer> {

	@Query("SELECT g  FROM GlobalSetting g")
	public GlobalSetting getGlobalSetting();
	
	@Transactional
	@Modifying
	@Query("update GlobalSetting g SET g.cpc =:cpc, g.cpm =:cpm WHERE g.id = :id")
	public void updateCpcAndCpmById(@Param(value="id")Integer id,@Param(value = "cpc") double cpc,@Param(value = "cpm") double cpm);
	
}
