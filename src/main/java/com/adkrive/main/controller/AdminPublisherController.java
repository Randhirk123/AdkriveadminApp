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
import com.adkrive.main.model.Country;
import com.adkrive.main.model.ManageKeyWord;
import com.adkrive.main.model.Publisher;
import com.adkrive.main.model.UserLoginHistory;
import com.adkrive.main.service.AdminService;

@Controller
public class AdminPublisherController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private JavaMailSender mailSender;

	private UserLoginHistory history;
	/*
	 * @GetMapping("/publisher/all") public String viewAllPublishers(Model model,
	 * HttpServletRequest request) { List<Publisher> listOfAllPublishers =
	 * adminService.getAllPublisher(); model.addAttribute("all", "all");
	 * model.addAttribute("listOfAllPublishers", listOfAllPublishers); return
	 * "publisher";
	 * 
	 * }
	 * 
	 * @GetMapping("publisher/active/all") public String
	 * viewAllActivePublishers(Model model,HttpSession session, HttpServletRequest
	 * req) {
	 * 
	 * session=req.getSession(); model.addAttribute("active", "active");
	 * List<Publisher> listOfAllActivePublishers =
	 * adminService.getAllActivePublisher();
	 * model.addAttribute("listOfAllActivePublishers", listOfAllActivePublishers);
	 * return "publisher";
	 * 
	 * }
	 * 
	 * @GetMapping("/publisher/banned/all") public String
	 * viewAllBannedPublishers(Model model) { List<Publisher>
	 * listOfAllBannedPublishers = adminService.getAllBannedPublisher();
	 * model.addAttribute("banned", "banned");
	 * model.addAttribute("listOfAllBannedPublishers", listOfAllBannedPublishers);
	 * return "publisher";
	 * 
	 * }
	 * 
	 * @GetMapping("/publisher/email-unverified") public String
	 * viewAllEmailUnverifiedPublishers(Model model) { List<Publisher>
	 * listOfAllEmailUnverifiedPublisher =
	 * adminService.getAllEmailUnverifiedPublisher();
	 * model.addAttribute("emailUnverified", "emailUnverified");
	 * model.addAttribute("listOfAllEmailUnverifiedPublisher",
	 * listOfAllEmailUnverifiedPublisher); return "publisher";
	 * 
	 * }
	 * 
	 * @GetMapping("/publisher/sms-unverified") public String
	 * viewAllSmsUnverifiedPublishers(Model model) { List<Publisher>
	 * listOfAllSmsUnverifiedPublisher =
	 * adminService.getAllSmslUnverifiedPublisher();
	 * model.addAttribute("smsUnverified", "smsUnverified");
	 * model.addAttribute("listOfAllSmsUnverifiedPublisher",
	 * listOfAllSmsUnverifiedPublisher); return "publisher";
	 * 
	 * }
	 * 
	 * @GetMapping("/publisher/send-email") public String
	 * viewSendEmailToAllPublishers() { return "sendMailToAllPublisher";
	 * 
	 * }
	 * 
	 * @PostMapping("/publisher/send-email") public String
	 * sendEmailToAllPublishers(@RequestParam("subject") String subject,
	 * 
	 * @RequestParam("message") String message, Model model) throws
	 * MessagingException, UnknownHostException, IOException { List<Publisher>
	 * allPublishList = adminService.getAllPublisher();
	 * 
	 * List<String> names =
	 * allPublishList.stream().map(Publisher::getEmail).collect(Collectors.toList())
	 * ;
	 * 
	 * System.out.println(message); boolean status = Utility.sendMailToAll(names,
	 * subject, message, mailSender); if (status) {
	 * model.addAttribute("suceessMail",
	 * "Mail send Successfully to all Publishers"); return "sendMailToAllPublisher";
	 * } else { model.addAttribute("failureMail",
	 * "Mail send Failed to all Publishers"); return "sendMailToAllPublisher"; }
	 * 
	 * }
	 * 
	 * @GetMapping("/publisher/search") public String
	 * searchByNameOrEmail(@RequestParam("search") String value, Model
	 * model,HttpSession session) {
	 * 
	 * List<Publisher> publishersList =
	 * adminService.searchPublisherByNameOrEmail(value);
	 * model.addAttribute("search", "search"); model.addAttribute("searchList",
	 * publishersList);
	 * 
	 * return "publisher";
	 * 
	 * }
	 * 
	 * @GetMapping("/publisher/details/{id}") public String
	 * viewActiveDetails(@PathVariable Integer id,Model model) {
	 * model.addAttribute("id", id); model.addAttribute("mkbrd",
	 * adminService.updateById(id).orElse(null));
	 * model.addAttribute("countryOptions",getCountryList()); return
	 * "activePublisherDetails";
	 * 
	 * }
	 * 
	 * @PostMapping("/publisher/update/{id}") public String
	 * updateActiveDetails(@PathVariable Integer
	 * id,@ModelAttribute("publisher")Publisher publish,Model model) {
	 * System.out.println(publish.getName());
	 * System.out.println(publish.getEmail());
	 * System.out.println(publish.getPhone());
	 * System.out.println(publish.getCity());
	 * System.out.println(publish.getCountry());
	 * System.out.println(publish.getEv()); System.out.println(publish.getSv());
	 * System.out.println(publish.getTs()); System.out.println(publish.getTv());
	 * return null; }
	 * 
	 * 
	 * public Map<String, String> getCountryList() { Map<String, String> countryMap
	 * = new LinkedHashMap<String, String>(); List<Country>countryList
	 * =adminService.getListOfCountries(); if(countryList!=null) { for(int i=0;
	 * i<countryList.size(); i++) {
	 * countryMap.put(countryList.get(i).getCountryCode().toString(),
	 * countryList.get(i).getCountryName().toString()); } }
	 * 
	 * return countryMap;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * Trying to implement in other wayssss
	 * 
	 */

	@GetMapping("/publisher/all")
	public String showReadAllPublisherPage(Model model) {
		model.addAttribute("publish", new Publisher());
		model.addAttribute("all", "all");
		model.addAttribute("listOfAllPublishers", adminService.getAllPublisher());
		return "publisher";
	}

	@GetMapping("/publisher/details/{id}")
	public String showUpdatePublisherPage(@PathVariable Integer id, Model model) {

		model.addAttribute("id", id);
		model.addAttribute("publish", adminService.updateByPublisherId(id).orElse(null));
		return "activePublisherDetails";
	}

	@PostMapping("/publisher/update/{id}")
	public String updatePublisherPage(@PathVariable Integer id, @ModelAttribute("publish") Publisher publish,
			Model model, HttpServletRequest req) {
		System.out.println("===" + " " + publish.getEv() + "=================");
		adminService.updatePublisherDetail(id, publish);
		model.addAttribute("publish", adminService.updateByPublisherId(id).orElse(null));
		return "activePublisherDetails";
	}

	@GetMapping("/publisher/active/all")
	public String showReadAllActivePublisherPage(Model model) {
		model.addAttribute("publish", new Publisher());
		model.addAttribute("active", "active");
		model.addAttribute("listOfAllActivePublishers", adminService.getAllActivePublisher());
		return "publisher";
	}

	@GetMapping("/publisher/banned/all")
	public String showReadAllBannedPublisherPage(Model model) {
		model.addAttribute("publish", new Publisher());
		model.addAttribute("banned", "banned");
		model.addAttribute("listOfAllBannedPublishers", adminService.getAllBannedPublisher());
		return "publisher";
	}

	@GetMapping("/publisher/email-unverified")
	public String showReadAllEmailUnverifiedPublisherPage(Model model) {
		model.addAttribute("publish", new Publisher());
		model.addAttribute("emailUnverified", "emailUnverified");
		model.addAttribute("listOfAllEmailUnverifiedPublisher", adminService.getAllEmailUnverifiedPublisher());
		return "publisher";
	}

	@GetMapping("/publisher/sms-unverified")
	public String showReadAllSmsUnverifiedPublisherPage(Model model) {
		model.addAttribute("publish", new Publisher());
		model.addAttribute("smsUnverified", "smsUnverified");
		model.addAttribute("listOfAllSmsUnverifiedPublisher", adminService.getAllSmslUnverifiedPublisher());
		return "publisher";
	}

	@GetMapping("/publisher/search")
	public String searchByNameOrEmail(@RequestParam("search") String value, Model model, HttpSession session) {
		List<Publisher> publishersList = adminService.searchPublisherByNameOrEmail(value);
		model.addAttribute("search", "search");
		model.addAttribute("searchList", publishersList);
		return "publisher";
	}

	public Map<String, String> getCountryList() {

		Map<String, String> countryMap = new HashMap<String, String>();
		List<Country> countryList = adminService.getListOfCountries();
		if (countryList != null) {
			for (int i = 0; i < countryList.size(); i++) {
				countryMap.put(countryList.get(i).getCountryCode().toString(),
						countryList.get(i).getCountryName().toString());
			}

		}

		return countryMap;
	}

	@GetMapping("/publisher/login/history/{id}")
	public String publisherAddOrSubBalancePage(Model model, @PathVariable(value = "id") Integer pid) {
		model.addAttribute("pubLogHistory", adminService.getAllPublisherLogin(pid));
		return "publisherLogHistory";
	}

	@GetMapping("/users/login/ipHistory/{ip}")
	public String redirectPageTouserHistoryBasedOnIp(Model model, @PathVariable(value = "ip") String ip) {
		model.addAttribute("pubLogIpHistory", adminService.getAllPublisherLoginIp(ip));
		return "publishUserLoginIpHistory";

	}

	@GetMapping("/user/email/{id}/publisher")
	public String showSendMailToSpecificPublisher(Model model, @PathVariable(value = "id") Integer id) {

		return "sendMailToSpecificPublisher";
	}

	@PostMapping("/publisher/send-email")
	public String sendEmailToAllPublishers(@RequestParam("subject") String subject,

			@RequestParam("message") String message, Model model)
			throws MessagingException, UnknownHostException, IOException {
		List<Publisher> allPublishList = adminService.getAllPublisher();

		List<String> names = allPublishList.stream().map(Publisher::getEmail).collect(Collectors.toList());

		System.out.println(message);
		boolean status = Utility.sendMailToAll(names, subject, message, mailSender);
		if (status) {
			model.addAttribute("suceessMail", "Mail send Successfully to all Publishers");
			return "sendMailToAllPublisher";
		} else {
			model.addAttribute("failureMail", "Mail send Failed to all Publishers");
			return "sendMailToAllPublisher";
		}

	}

	@GetMapping("/publisher/send-email")
	public String viewSendEmailToAllPublishers() {
		return "sendMailToAllPublisher";

	}

}
