package com.adkrive.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.adkrive.main.model.Admin;
import com.adkrive.main.model.Password;
import com.adkrive.main.service.AdminService;


@Controller
public class AdminPasswordController {

	@Autowired
	private AdminService adminService;
	@GetMapping("/password") 
    public String passwordSetting(Model model) 
    {
    	model.addAttribute("pass", new Password());
    	Password passDetails=adminService.getPassWordDetails();
    	if(passDetails!=null)
    	{
    		Admin admin=adminService.getAdminDetailsByEmail(passDetails.getEmail());
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
    	
    	return "password_setting";
    }
    
    @PostMapping("/password") 
    public String savePasswordSetting(@ModelAttribute("pass")Password pass,Model model) 
    {
    	
    	System.out.println(pass.getId());
    	System.out.println(pass.getPassword());
    	System.out.println(pass.getNewPassword());
    	System.out.println(pass.getConfPassword());
    	boolean confirmpassStatus=adminService.saveNewPassword(pass);
    	System.out.println(confirmpassStatus);
    	if(confirmpassStatus)
    	{
    		model.addAttribute("status","Password Changed Successfully");
    		Password passDetails=adminService.getPassWordDetails();
        	if(passDetails!=null)
        	{
        		Admin admin=adminService.getAdminDetailsByEmail(passDetails.getEmail());
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
    		
    		return "password_setting";
    	}
    	else
    	{
    		
    		model.addAttribute("status","Entered Password Didn't Matched");
    		return "password_setting";
    	}
    	
    }
}
