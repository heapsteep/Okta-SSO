package com.heapsteep.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String greetUser(Principal principal){
		return "Hi "+principal.getName()+" welcome from Okta-SSO application";
	}
	
	@GetMapping("/demo")
	public String demo(Principal principal){
		return "This is a message from /demo url";
	}

}
