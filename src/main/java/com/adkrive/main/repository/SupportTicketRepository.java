package com.adkrive.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adkrive.main.model.Ticket;

@Repository
public interface SupportTicketRepository extends JpaRepository<Ticket, Integer>{
	
	@Query("SELECT t FROM Ticket t WHERE status=0")
	public List<Ticket> getAllPendingTicket();

	@Query("SELECT t FROM Ticket t WHERE status=3")
	public List<Ticket> getAllclosedTicket();

	@Query("SELECT t FROM Ticket t WHERE status=1")
	public List<Ticket> getAllAnsweredTicket();

}
