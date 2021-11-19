package com.adkrive.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminLogOutController {

	@GetMapping("/logout")
	public String adminLogout(HttpSession session)
	{
		String user=session.getAttribute("admin").toString();
		System.out.println("in logout"+" "+user);
		session.removeAttribute(user);
		if(session!=null)
		{
			session.invalidate();
		}
		System.out.println("after logout"+" "+user);
		
		return "redirect:/admin";
		
	}
	
}
