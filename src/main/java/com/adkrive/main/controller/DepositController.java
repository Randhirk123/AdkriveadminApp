package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.adkrive.main.model.Deposit;
import com.adkrive.main.service.AdminService;

@Controller
public class DepositController {
	@Autowired
	private AdminService adminService;
	
	
	@GetMapping("/deposit/pending")
	public String showPendingDeposit(Model model)
	{
		model.addAttribute("deposit", new Deposit());
		model.addAttribute("pendingList", adminService.getAllPendingDeposit());
		return "pendingDeposit";
		
	}
	
	@GetMapping("/deposit/approved")
	public String showApprovedDeposit(Model model)
	{
		model.addAttribute("deposit", new Deposit());
		model.addAttribute("approvedList", adminService.getAllApprovedDeposit());
		return "approvedDeposit";
		
	}
	
	@GetMapping("/deposit/successful")
	public String showSuccessDeposit(Model model)
	{
		model.addAttribute("deposit", new Deposit());
		model.addAttribute("succesList", adminService.getAllSuccesDeposit());
		return "successDeposit";
		
	}
	@GetMapping("/deposit/rejected")
	public String showRejectedDeposit(Model model)
	{
		model.addAttribute("deposit", new Deposit());
		model.addAttribute("rejectedList", adminService.getAllRejectedDeposit());
		return "rejectedDeposit";
		
	}
	@GetMapping("/deposit")
	public String showAllDeposit(Model model)
	{
		model.addAttribute("deposit", new Deposit());
		model.addAttribute("depositList", adminService.getAllDeposit());
		return "allDeposit";
		
	}
	
	
}
