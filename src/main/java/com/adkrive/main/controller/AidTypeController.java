package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adkrive.main.model.AdType;
import com.adkrive.main.service.AdminService;

@Controller
public class AidTypeController {

	/*
	 * @Autowired private AdminService adminService;
	 * 
	 * @GetMapping("/advertise/type") public String showReadManageKeywordPage(Model
	 * model) { model.addAttribute("aidType", new AdType());
	 * model.addAttribute("listAid", adminService.getAllAidTpe()); return "adType";
	 * }
	 * 
	 * @PostMapping("/advertise/add/type") public String
	 * createManageKeywordPage(@ModelAttribute("aidType") AdType aidType, Model
	 * model) {
	 * System.out.println("============================"+aidType.getStatus()+
	 * "++++++++++++++++++"+aidType.getAdName()+"++++++++++++++++++++++++++++++++");
	 * adminService.addAidType(aidType); model.addAttribute("listAid",
	 * adminService.getAllAidTpe()); return "adType"; }
	 * 
	 * @GetMapping("/advertise/update/type/{id}") public String
	 * showUpdateAidTypePage(@PathVariable Integer id, Model model) {
	 * model.addAttribute("id", id); model.addAttribute("aidType",
	 * adminService.updateAidById(id).orElse(null)); return "adType"; }
	 * 
	 * @PostMapping("/advertise/update/type/{id}") public String
	 * updateAidTypedPage(@PathVariable Integer id, @ModelAttribute("aidType")
	 * AdType aidType) { adminService.updateAidType(id, aidType); return
	 * "redirect:/advertise/type"; }
	 */
}
