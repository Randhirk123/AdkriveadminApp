package com.adkrive.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.adkrive.main.model.AdType;
import com.adkrive.main.model.Advertise;
import com.adkrive.main.model.BlockedIpLog;
import com.adkrive.main.model.GlobalSetting;
import com.adkrive.main.model.IpLog;
import com.adkrive.main.model.PricePlan;
import com.adkrive.main.service.AdminService;

@Controller
public class AdvertisesController {

	@Autowired
	private AdminService adminService;
	
	//All Advertiser started
	@GetMapping("/advertise/all")
	public String showAdvertisesAll(Model model) {
		model.addAttribute("advertise", new Advertise());
		model.addAttribute("listAdvertise", adminService.getAllAdvertise());
		return "advertise";
	}
	
	//all price plan started
	
	@GetMapping("/advertise/price-plan")
	public String showPricePlanAll(Model model) {
		model.addAttribute("priceplan", new PricePlan());
		model.addAttribute("pricePlanList", adminService.getAllPricePlan());
		return "priceplan";
	}
	
	@PostMapping("/advertise/add/price-plan")
	public String createPricePlan(@ModelAttribute("priceplan") PricePlan plan, Model model) {
		
		adminService.addPricePlan(plan);
		model.addAttribute("pricePlanList", adminService.getAllPricePlan());
		return "redirect:/advertise/price-plan";
	}
	
	@GetMapping("/advertise/update/price-plan/{id}")
	public String showUpdatePricePlanPage(@PathVariable Integer id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("priceplan", adminService.updatePricePlanById(id).orElse(null));
		return "priceplan";
	}

	@PostMapping("/advertise/update/price-plan/{id}")
	public String updatePricePlanPage(@PathVariable Integer id, @ModelAttribute("priceplan") PricePlan plan,Model model) {
		adminService.updatePricePlan(id, plan);
		model.addAttribute("priceplan", adminService.updatePricePlanById(id).orElse(null));
		return "redirect:/advertise/price-plan";
	}

	//all ip log started
	@GetMapping("/advertise/ip-log")
	public String showIpLogAll(Model model) {
		model.addAttribute("ipLog", new IpLog());
		model.addAttribute("ipList", adminService.getAllIpLog());
		return "iplog";
	}
	
	//blocked ip log started
	
	@GetMapping("/advertise/blocked/ip-log")
	public String showBlockedIpLogAll(Model model) {
		model.addAttribute("blockIpLog", new BlockedIpLog());
		model.addAttribute("blockList", adminService.getAllBlockIpLog());
		return "blockIplog";
	}
	//AdType functionality started
	@GetMapping("/advertise/type")
	public String showAdtypePage(Model model) {
		model.addAttribute("aidType", new AdType());
		model.addAttribute("listAid", adminService.getAllAidTpe());
		return "adType";
	}

	@PostMapping("/advertise/add/type")
	public String createAdTypePage(@ModelAttribute("aidType") AdType aidType, Model model) {
		System.out.println("============================"+aidType.getStatus()+"++++++++++++++++++"+aidType.getAdName()+"++++++++++++++++++++++++++++++++");
		adminService.addAidType(aidType);
		return "redirect:/advertise/type";
	}
	
	

	@GetMapping("/advertise/update/type/{id}")
	public String showUpdateAidTypePage(@PathVariable Integer id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("aidType", adminService.updateAidById(id).orElse(null));
		return "adType";
	}

	@PostMapping("/advertise/update/type/{id}")
	public String updateAidTypedPage(@PathVariable Integer id, @ModelAttribute("aidType") AdType aidType) {
		adminService.updateAidType(id, aidType);
		return "redirect:/advertise/type";
	}
	@GetMapping("/advertise/cpc&cpm")
	public String showCpcAndCpmPage(Model model)
	{
		model.addAttribute("globalSetting",adminService.getCpcAndCpm());
		return "cpcAndCpm";
	}
	
	
	@PostMapping("/advertise/cpc&cpm/update")
	public String updateCpcAndCpmPage(@ModelAttribute("globalSetting") GlobalSetting setting,HttpServletRequest req)
	{
		Integer id=Integer.parseInt(req.getParameter("id").toString());
       		adminService.updateCpcAndCpm(id,setting.getCpc(),setting.getCpm());
		
		return "redirect:/advertise/cpc&cpm";
	}
	
	

}
