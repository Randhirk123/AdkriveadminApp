package com.adkrive.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.adkrive.main.general.GeneralConstant;
import com.adkrive.main.model.Admin;
import com.adkrive.main.model.AdvTransactionLog;
import com.adkrive.main.service.AdminService;

@Controller
public class AdminDashBoardController {
	@Autowired
	private AdminService adminService;
	private final Logger LOGGER = LogManager.getLogger(AdminDashBoardController.class);

	@GetMapping("/dashboard")
	public String viewDashBoard(Model model) {
		Admin adminDetails = adminService.getAdminDetails();
		if (adminDetails != null) {
			Admin admin1 = adminService.getAdminDetailsByEmail(adminDetails.getEmail());
			if (admin1 != null) {
				byte[] encoded = org.apache.commons.codec.binary.Base64.encodeBase64(admin1.getImage());
				String encodedString = new String(encoded);
				model.addAttribute("image", encodedString);
				//settings for total view
				
			}
		}
		
		 model.addAttribute("total_Advertises", adminService.getAllAdvertise().size());
		  model.addAttribute("total_Advertiser", adminService.getAllAdvertiser().size());
		  model.addAttribute("total_Publisher", adminService.getAllPublisher().size());
		  model.addAttribute("total_AidType", adminService.getAllAidTpe().size());
		  model.addAttribute("total_PricePlan", adminService.getAllPricePlan().size());
		  model.addAttribute("total_ApprovedDomain", adminService.getAllApprovedDomain().size());
		  model.addAttribute("total_PendingDomain", adminService.getAllPendingDomain().size());
		  model.addAttribute("total_WithdrawMethod", adminService.getAllWithdrawMethod().size());
		  model.addAttribute("total_Withdraw", adminService.getAllWithdrawls().size());
		  model.addAttribute("total_WithdrawPending", adminService.getAllPendingWithdrawls().size());
		  model.addAttribute("total_WithdrawApproved", adminService.getAllApprovedWithdrawls().size());
		  model.addAttribute("total_PendingTicket", adminService.getAllPendingTicket().size());
		  model.addAttribute("advTxLog", adminService.getAllAdvTxLog());
			  return "dashboard";

	}

	@PostMapping("/dashboard")
	public String viewDashBoard(@ModelAttribute("admin") Admin admin, HttpSession session, HttpServletRequest req,
			Model model) {
		LOGGER.debug("inside dashboard");
		/*
		 * List<Publisher> listOfAllPublishers=adminService.getAllPublisher(); long
		 * listofuvep=listOfAllPublishers.stream().filter(ev->(ev.getEv()!=null &&
		 * ev.getEv()>0)).count(); long
		 * listofuvsp=listOfAllPublishers.stream().filter(ev->(ev.getSv()!=null &&
		 * ev.getSv()>0)).count();
		 */

		boolean status = adminService.matchAdminLoginDetails(admin.getUserName(), admin.getPassword());
		if (status) {
			Admin adminDetails = adminService.getAdminDetails();
			if (adminDetails != null) {
				session=req.getSession();
				session.setAttribute("admin",adminDetails.getUserName());
				Admin admin1 = adminService.getAdminDetailsByEmail(adminDetails.getEmail());
				if (admin1 != null) {
					byte[] encoded = org.apache.commons.codec.binary.Base64.encodeBase64(admin1.getImage());
					String encodedString = new String(encoded);
					model.addAttribute("image", encodedString);
				}
			}

			/*
			 * model.addAttribute("no_of_uve", listofuvep);
			 * model.addAttribute("no_of_uvs",listofuvsp );
			 */
			// model.addAttribute("total_Publisher", listOfAllPublishers.size());
			
			  model.addAttribute("total_Advertises", adminService.getAllAdvertise().size());
			  model.addAttribute("total_Advertiser", adminService.getAllAdvertiser().size());
			  model.addAttribute("total_Publisher", adminService.getAllPublisher().size());
			  model.addAttribute("total_AidType", adminService.getAllAidTpe().size());
			  model.addAttribute("total_PricePlan", adminService.getAllPricePlan().size());
			  model.addAttribute("total_ApprovedDomain", adminService.getAllApprovedDomain().size());
			  model.addAttribute("total_PendingDomain", adminService.getAllPendingDomain().size());
			  model.addAttribute("total_WithdrawMethod", adminService.getAllWithdrawMethod().size());
			  model.addAttribute("total_Withdraw", adminService.getAllWithdrawls().size());
			  model.addAttribute("total_WithdrawPending", adminService.getAllPendingWithdrawls().size());
			  model.addAttribute("total_WithdrawApproved", adminService.getAllApprovedWithdrawls().size());
			  model.addAttribute("total_PendingTicket", adminService.getAllPendingTicket().size());
			  model.addAttribute("advTxLog", adminService.getAllAdvTxLog());
			 
			GeneralConstant.loginFailureCount = 0;
			return "dashboard";
		} else {
			GeneralConstant.loginFailureCount = 1;
			return "redirect:/admin";
		}
	}
	
	 
	
	
}
