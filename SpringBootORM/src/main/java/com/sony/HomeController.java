package com.sony;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String homePage()
	{
		System.out.println("In Home Page====================================");
		return "index";
	}
}
