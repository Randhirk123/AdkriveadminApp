package com.adkrive.main.controller;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adkrive.main.general.Utility;
import com.adkrive.main.model.AdvTransactionLog;
import com.adkrive.main.model.Advertiser;
import com.adkrive.main.model.Country;
import com.adkrive.main.model.Publisher;
import com.adkrive.main.service.AdminService;

@Controller
public class AdminAdvertiserController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private JavaMailSender mailSender;

	@GetMapping("/advertiser/all")
	public String viewAllAdvertiser(Model model, HttpServletRequest request) {
		List<Advertiser> listOfAllAdvertiser = adminService.getAllAdvertiser();
		model.addAttribute("advertise",new Advertiser());
		model.addAttribute("all", "all");
		model.addAttribute("listOfAllAdvertiser", listOfAllAdvertiser);
		return "advertiser";

	}

	@GetMapping("/advertiser/active/all")
	public String viewAllActiveAdvertiser(Model model,HttpSession session, HttpServletRequest req) {
		session=req.getSession();
		model.addAttribute("active", "active");
		List<Advertiser> listOfAllActiveAdvertiser = adminService.getAllActiveAdvertiser();
		model.addAttribute("listOfAllActiveAdvertiser", listOfAllActiveAdvertiser);
		return "advertiser";

	}

	@GetMapping("/advertiser/banned/all")
	public String viewAllBannedAdvertiser(Model model) {
		List<Advertiser> listOfAllBannedAdvertiser = adminService.getAllBannedAdvertiser();
		model.addAttribute("banned", "banned");
		model.addAttribute("listOfAllBannedAdvertiser", listOfAllBannedAdvertiser);
		return "advertiser";

	}

	@GetMapping("/advertiser/email-unverified")
	public String viewAllEmailUnverifiedAdvertiser(Model model) {
		List<Advertiser> listOfAllEmailUnverifiedAdvertiser = adminService.getAllEmailUnverifiedAdvertiser();
		model.addAttribute("emailUnverified", "emailUnverified");
		model.addAttribute("listOfAllEmailUnverifiedAdvertiser", listOfAllEmailUnverifiedAdvertiser);
		return "advertiser";

	}

	@GetMapping("/advertiser/sms-unverified")
	public String viewAllSmsUnverifiedAdvertiser(Model model) {
		List<Advertiser> listOfAllSmsUnverifiedAdvertiser = adminService.getAllSmslUnverifiedAdvertiser();
		model.addAttribute("smsUnverified", "smsUnverified");
		model.addAttribute("listOfAllSmsUnverifiedAdvertiser", listOfAllSmsUnverifiedAdvertiser);
		return "advertiser";

	}

	@GetMapping("/advertiser/send-email")
	public String viewSendEmailToAllAdvertiser() {
		return "sendMailToAllAdvertiser";

	}

	@PostMapping("/advertiser/send-email")
	public String sendEmailToAllAdvertiser(@RequestParam("subject") String subject,
			@RequestParam("message") String message, Model model)
			throws MessagingException, UnknownHostException, IOException {
		List<Advertiser> allAdvList = adminService.getAllAdvertiser();

		List<String> names = allAdvList.stream().map(Advertiser::getEmail).collect(Collectors.toList());

		System.out.println(message);
		boolean status = Utility.sendMailToAll(names, subject, message, mailSender);
		if (status) {
			model.addAttribute("suceessMail", "Mail send Successfully to all Advertiser");
			return "sendMailToAllAdvertiser";
		} else {
			model.addAttribute("failureMail", "Mail send Failed to all Advertiser");
			return "sendMailToAllAdvertiser";
		}

	}

	@GetMapping("/advertiser/search")
	public String searchByNameOrEmail(@RequestParam("search") String value, Model model,HttpSession session) {

		List<Advertiser> advertiserList = adminService.searchAdvertiserByNameOrEmail(value);
		model.addAttribute("search", "search");
		model.addAttribute("searchList", advertiserList);
		return "advertiser";

	}
	
	
	
	 public  Map<String, String> getCountryList()
	    {
	    	Map<String, String> countryMap = new LinkedHashMap<String, String>();
	    	List<Country>countryList =adminService.getListOfCountries();
	    	if(countryList!=null)
	    	{
	    		for(int i=0; i<countryList.size(); i++)
	        	{
	        		countryMap.put(countryList.get(i).getCountryCode().toString(), countryList.get(i).getCountryName().toString());
	        	}
	    	}
	    
			return countryMap;
	    	
	    }
	 
	 
	 
	 //Changing method

		@GetMapping("/advertiser/details/{id}")
		public String showUpdateAdvertiserPage(@PathVariable Integer id, Model model) {
			model.addAttribute("id", id);
			model.addAttribute("advertise", adminService.updateByAdvertiserId(id).orElse(null));
			return "advertiserDetails";
		}

		@PostMapping("/advertiser/update/{id}")
		public String updateAdvertiserPage(@PathVariable Integer id, @ModelAttribute("advertise") Advertiser advertiser,Model model) {
			adminService.updateAdvertiserDetail(id, advertiser);
			model.addAttribute("advertise", adminService.updateByAdvertiserId(id).orElse(null));
			return "advertiserDetails";
		}

		
		@PostMapping("/advertiser/add-sub-balance/{id}")
		public String advertiserAddOrSubBalance(@PathVariable Integer id,@RequestParam(value ="amount") String amount, @ModelAttribute("advertise") Advertiser advertiser,Model model) {
			//System.out.println(amount,advertiser,new AdvTransactionLog());
			adminService.saveOrUpdateAdvAndTrans(amount,advertiser,new AdvTransactionLog());
			/*
			 * adminService.updateAdvertiserDetail(id, advertiser);
			 * model.addAttribute("advertise",
			 * adminService.updateByAdvertiserId(id).orElse(null));
			 */
			
			
			return "redirect:/advertiser/details/{id}";
		}
		
		@GetMapping("/advertiser/login/history/{id}")
		public String advertiserLogHistoryPage(Model model, @PathVariable(value = "id") Integer aid) {
			model.addAttribute("advLogHistory", adminService.getAllAdvertiserLogin(aid));
			return "advertiserLogHistory";
		}

		/*
		 * @GetMapping("/users/login/ipHistory/{ip}") public String
		 * advTouserHistoryBasedOnIp(Model model, @PathVariable(value = "aip") String
		 * ip) { model.addAttribute("advLogIpHistory",
		 * adminService.getAllAdvertiserLoginIp(ip)); return "advUserLoginIpHistory";
		 * 
		 * }
		 */

}
