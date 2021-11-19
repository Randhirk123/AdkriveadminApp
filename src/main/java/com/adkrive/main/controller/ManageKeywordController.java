package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.adkrive.main.model.ManageKeyWord;
import com.adkrive.main.service.AdminService;

@Controller
public class ManageKeywordController {

	@Autowired
	private AdminService adminService;

	@GetMapping("/keywords")
	public String showReadManageKeywordPage(Model model) {
		model.addAttribute("mkbrd", new ManageKeyWord());
		model.addAttribute("listKeword", adminService.getAllManageKeyword());
		return "manageKeyword";
	}

	@PostMapping("/add/keywords")
	public String createManageKeywordPage(@ModelAttribute("mkbrd") ManageKeyWord maWord, Model model) {
		adminService.addKeyWords(maWord);
		model.addAttribute("listKeword", adminService.getAllManageKeyword());
		return "redirect:/keywords";
	}

	
	  @GetMapping("/update/keyword/{id}") public String
	  showUpdateManageKeywordPage(@PathVariable Integer id, Model model)
	  {
		  model.addAttribute("id", id);
		  model.addAttribute("mkbrd",adminService.updateById(id).orElse(null));
		  return "manageKeyword";
	  }
	 

	@PostMapping("/update/keywords/{id}")
	public String updateManageKeywordPage(@PathVariable Integer id, @ModelAttribute("mkbrd") ManageKeyWord maWord,Model model) {
		 model.addAttribute("mkbrd",adminService.updateById(id).orElse(null));
		 adminService.updatemanageKeyword(id, maWord);
		 model.addAttribute("mkbrd",adminService.updateById(id).orElse(null));
		return "redirect:/keywords";
	}

	@PostMapping("/remove/keywords/{id}")
	public String deleteManageKeywordPage(@PathVariable Integer id) {
		adminService.deleteManageKeyword(id);
		return "redirect:/keywords";
	}

}
