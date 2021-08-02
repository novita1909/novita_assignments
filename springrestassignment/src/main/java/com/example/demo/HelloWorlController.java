package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {

	/*@GetMapping("/helloworld")
	public String HelloWorld()
	{
		return "hello world";
	}*/
	
	@GetMapping("helloworld")
	public HelloWorld helloWorld()
	{
	  return new HelloWorld("hello world");
	}
}
