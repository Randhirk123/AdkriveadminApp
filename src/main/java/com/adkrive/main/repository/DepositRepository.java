package com.adkrive.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Deposit;

@Repository
public interface DepositRepository extends JpaRepository<Deposit, Integer> {

	@Query("SELECT d FROM Deposit d WHERE status=2")
	public List<Deposit> getAllPendingDeposit();
	
	@Query("SELECT d FROM Deposit d WHERE status=1")
	public List<Deposit> getAllSuccessDeposit();
	
	@Query("SELECT d FROM Deposit d WHERE status=3")
	public List<Deposit> getAllRejectedDeposit();
	
	@Query("SELECT d FROM Deposit d WHERE status=0")
	public List<Deposit> getAllApprovedDeposit();
}
