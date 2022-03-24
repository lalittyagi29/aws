package com.awshosting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/welcome")
	public static String test() {
		
		return "AWS Hosting Testing second branch";
	}
	
	@GetMapping("/lalit")
	public static String fun() {
		
		return "Welcome to Lalit Tyagi's World";
	}
	

}
