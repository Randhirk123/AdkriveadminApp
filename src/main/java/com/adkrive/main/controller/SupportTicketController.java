package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.adkrive.main.model.Ticket;
import com.adkrive.main.service.AdminService;

@Controller
public class SupportTicketController {

	@Autowired
	private AdminService adminService;
	@GetMapping("/tickets")
	public String showAllTicket(Model model)
	{
		model.addAttribute("ticket",new Ticket());
		model.addAttribute("allTicketList",adminService.getAllTicket());
		return "ticket";
		
	}
	
	@GetMapping("/tickets/pending")
	public String showPendingTicket(Model model)
	{
		
		model.addAttribute("ticket",new Ticket());
		model.addAttribute("pendingTicketList",adminService.getAllPendingTicket());
		return "pendingTicket";
		
	}
	
	@GetMapping("/tickets/closed")
	public String showClosedTicket(Model model)
	{
		model.addAttribute("ticket",new Ticket());
		model.addAttribute("closedTicketList",adminService.getAllClosedTicket());
		return "closedTicket";
		
	}
	
	@GetMapping("/tickets/answered")
	public String showAnsweredTicket(Model model)
	{
		model.addAttribute("ticket",new Ticket());
		model.addAttribute("answeredTicketList",adminService.getAllAnsweredTicket());
		return "answeredTicket";
		
	}
	
	@GetMapping("/tickets/view/{id}")
	public String ticketView(Model model,@PathVariable Integer id)
	{
		Ticket chkTicket=adminService.getTicketStatus(id);
		if(chkTicket.getStatus()==0)
		{
			model.addAttribute("ticketView", chkTicket);
			return "ticketView";
		}
		else
		{
			model.addAttribute("ticketView", chkTicket);
			return "closeTicketView";
		}
		
		
		
	}
	
	
	
	
	@PostMapping("/ticket/reply/{id}")
	public String replyTicket(Model model, @PathVariable Integer id, @ModelAttribute(value = "ticket") Ticket ticket)
	{
		System.out.println(ticket.getId());
		return "";
	}
}
