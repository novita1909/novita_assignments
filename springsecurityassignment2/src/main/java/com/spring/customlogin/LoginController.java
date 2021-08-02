package com.spring.customlogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

	
	@GetMapping("/login")
	public String login()
	{
		return "login.html";
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hi";
	}
	
	
	
	
}
