package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.adkrive.main.model.PmntGtway;
import com.adkrive.main.service.AdminService;

@Controller
public class PaymentGatewayController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/gateway/automatic")
	public String showReadGatewayPage(Model model) {
		model.addAttribute("pmnt", new PmntGtway());
		model.addAttribute("gatewayList", adminService.getAllPaymentGateway());
		return "gateway";
	}
	
	
	@GetMapping("/gateway/automatic/edit/{name}")
	public String showUpdateGatewayPage(@PathVariable String name , Model model) {
		model.addAttribute("id", name);
		model.addAttribute("pmnt", adminService.updategateWayByName(name).orElse(null));
		return "gatewayEdit";
	}
	
	
	@PostMapping("/gateway/automatic/edit/{name}")
	public String updateGatewayPage(@PathVariable String name , Model model) {
		//model.addAttribute("id", name);
		//model.addAttribute("pmnt", adminService.updategateWayByName(name).orElse(null));
		return "gatewayEdit";
	}
	
	
	
	
	/*
	 * @GetMapping("/gateway/automatic/deactivate") public String
	 */
	
	
	
}
