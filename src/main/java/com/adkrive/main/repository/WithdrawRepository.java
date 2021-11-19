package com.adkrive.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.WithDrawls;

@Repository
public interface WithdrawRepository extends JpaRepository<WithDrawls, Integer> {

	@Query("SELECT w FROM WithDrawls w WHERE status=2")
	public List<WithDrawls> getAllPendingWithdraw();

	@Query("SELECT w FROM WithDrawls w WHERE status=3")
	public List<WithDrawls> getAllRejectedWithdraw();
	
	@Query("SELECT w FROM WithDrawls w WHERE status=1")
	public List<WithDrawls> getAllApprovedWithdraw();
}
