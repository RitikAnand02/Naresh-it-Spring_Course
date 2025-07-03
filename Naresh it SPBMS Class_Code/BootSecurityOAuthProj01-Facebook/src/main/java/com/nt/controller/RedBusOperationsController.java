//RedBusOperationsController.java
package com.nt.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedBusOperationsController {
	
	@GetMapping("/home")
	public  String showHome() {
		
		return "<h1> Welcome to  RedBus.com </h1>";
	}
	
	@GetMapping("/after")
	public   String  aferLogin() {
		return "<h1> After successfully Login to  RedBus using third party App (Facebook/Gmail) </h1>";
	}
	
	@GetMapping("/user")
	public  Authentication  showUserDetails(Principal principal) {
		System.out.println("Currently logged username ::"+principal.getName());
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		return auth;
	}

}
