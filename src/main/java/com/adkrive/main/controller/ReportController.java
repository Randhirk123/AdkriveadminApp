package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.adkrive.main.model.AdvTransactionLog;
import com.adkrive.main.model.PublisherEarningLog;
import com.adkrive.main.model.UserLoginHistory;
import com.adkrive.main.service.AdminService;

@Controller
public class ReportController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/report/publishers/earning-logs")
	public String showublisherEarningLogPage(Model model) {
		model.addAttribute("plog", new PublisherEarningLog());
		model.addAttribute("pLogList", adminService.getAllPubLog());
		return "pubEarningLog";
	}
	
	
	@GetMapping("/report/transaction/advertisers")
	public String showPendingDomainPage(Model model) {
		model.addAttribute("advTx", new AdvTransactionLog());
		model.addAttribute("advTxLog", adminService.getAllAdvTxLog());
		return "advTxLogList";
		
	}
	
	@GetMapping("/report/login/history")
	public String showLoginHistoryPage(Model model) {
		model.addAttribute("userLogHistory", new UserLoginHistory());
		model.addAttribute("userLoginList", adminService.getAllUserLogin());
		
		return "userLoginHistory";
	}
	
}
