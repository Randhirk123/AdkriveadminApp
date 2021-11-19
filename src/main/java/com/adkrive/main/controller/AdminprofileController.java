package com.adkrive.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.adkrive.main.general.GeneralConstant;
import com.adkrive.main.model.Admin;
import com.adkrive.main.model.Profile;
import com.adkrive.main.service.AdminService;

@Controller
public class AdminprofileController {

	@Autowired
	private AdminService adminService;

	@GetMapping("/profile")
	public String profileSetting(Model model) {

		
		Profile profDetails=adminService.checkProfileRecord();
    	if(profDetails!=null)
    	{
    		Admin admin=adminService.getAdminDetailsByEmail(profDetails.getEmail());
    		if(admin!=null)
    		{
    			byte[] encoded = org.apache.commons.codec.binary.Base64.encodeBase64(admin.getImage());
				String encodedString = new String(encoded);
				model.addAttribute("image", encodedString);
    			model.addAttribute("name", admin.getName());
    			model.addAttribute("Username", admin.getUserName());
    			model.addAttribute("email", admin.getEmail());
    		}
    	}
		
		return "profile_setting";

	}

	@PostMapping("/profile")
	public String createOrUpdateProfile(@RequestParam("file") MultipartFile file, @RequestParam("name") String name,
			@RequestParam("email") String email, Model model) throws IOException {

		

		Integer counter= adminService.fetchOrUpdateProfile(file, name, email);
		if (counter != 0) {
			try {

				
				Profile profDetails=adminService.checkProfileRecord();
		    	if(profDetails!=null)
		    	{
		    		Admin admin=adminService.getAdminDetailsByEmail(profDetails.getEmail());
		    		if(admin!=null)
		    		{
		    			byte[] encoded = org.apache.commons.codec.binary.Base64.encodeBase64(admin.getImage());
						String encodedString = new String(encoded);
						model.addAttribute("image", encodedString);
		    			model.addAttribute("name", admin.getName());
		    			model.addAttribute("Username", admin.getUserName());
		    			model.addAttribute("email", admin.getEmail());
		    		}
		    	}
				return "profile_setting";
			} catch (Exception e) {
				
				model.addAttribute("message", "Error in getting image");
				return "redirect:/profile_setting";
			}
		} else {
			System.out.println("false");
			GeneralConstant.loginFailureCount = 1;
			return "";
		}
	}

}
