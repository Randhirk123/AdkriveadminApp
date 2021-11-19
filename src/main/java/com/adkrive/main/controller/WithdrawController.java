package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.adkrive.main.model.WithDrawMethod;
import com.adkrive.main.model.WithDrawls;
import com.adkrive.main.service.AdminService;

@Controller
public class WithdrawController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/withdraw/pending")
	public String showPendingWithDraw(Model model)
	{
		model.addAttribute("withdraw",new WithDrawls());
		model.addAttribute("pendingWithdrawList", adminService.getAllPendingWithdrawls());
		return "withdrawPending";
		
	}
	
	@GetMapping("/withdraw/approved")
	public String showApprovedWithDraw(Model model)
	{
		model.addAttribute("withdraw",new WithDrawls());
		model.addAttribute("approvedWithdrawList", adminService.getAllApprovedWithdrawls());
		return "withdrawApproved";
		
	}
	
	@GetMapping("/withdraw/rejected")
	public String showRejectedWithDraw(Model model)
	{
		model.addAttribute("withdraw",new WithDrawls());
		model.addAttribute("rejectedWithdrawList", adminService.getAllRejectedWithdrawls());
		
		return "withdrawRejected";
		
	}
	
	@GetMapping("/withdraw/log")
	public String showWithDrawLog(Model model)
	{
		model.addAttribute("withdraw",new WithDrawls());
		model.addAttribute("allWithdrawList", adminService.getAllWithdrawls());
		return "allWithdrawLog";
		
	}
	
	@GetMapping("/withdraw/method")
	public String showWithDrawMethod(Model model)
	{
		model.addAttribute("withMethod", new WithDrawMethod());
		model.addAttribute("listWithdrawMethod", adminService.getAllWithdrawMethod());
		return "withdrawMethod";
		
	}
	
	@GetMapping("/withdraw/method/create")
	public String showCreateWithdrawMethodPage(Model model)
	{
		model.addAttribute("withMethod", new WithDrawMethod());
		return "createWithdrawMethod";
	}
	
	@PostMapping("/withdraw/method/create")
	public String createWithdrawMethod(@ModelAttribute("withMethod") WithDrawMethod method, Model model,@RequestParam("file") MultipartFile file) {
		
		adminService.addWithdrawMethodType(method,file);
		model.addAttribute("listWithdrawMethod", adminService.getAllWithdrawMethod());
		return "createWithdrawMethod";
	}
	
}
