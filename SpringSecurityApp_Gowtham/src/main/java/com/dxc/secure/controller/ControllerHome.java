package com.dxc.secure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("http://localhost:4200")
public class ControllerHome {
	
	
	@RequestMapping("/")
	public String  homePage() {
		
		
		return "home.jsp";
		
		
		
	}
	
	
	
	
	
	

}
