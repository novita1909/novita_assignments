package com.example.SPRINGSECURITY_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJdbcController {

	@GetMapping("/")
	public String getAllBooks() {
		return "Hello";

	}

	@GetMapping("/user")
	public String getuser() {
		return "in user";

	}

	@GetMapping("/admin")
	public String getadmin() {
		return "in admin";

	}

}
