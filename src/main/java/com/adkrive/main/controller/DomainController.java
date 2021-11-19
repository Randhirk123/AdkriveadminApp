package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.adkrive.main.model.Domain;
import com.adkrive.main.service.AdminService;

@Controller
public class DomainController {


	@Autowired
	private AdminService adminService;
	
	@GetMapping("/domain/approved")
	public String showApprovedDomainPage(Model model) {
		model.addAttribute("domain", new Domain());
		model.addAttribute("domainList", adminService.getAllApprovedDomain());
		return "domain";
	}
	
	
	@GetMapping("/domain/pending")
	public String showPendingDomainPage(Model model) {
		model.addAttribute("domain", new Domain());
		model.addAttribute("pendingDomainList", adminService.getAllPendingDomain());
		
		return "pendingDomain";
	}
}
