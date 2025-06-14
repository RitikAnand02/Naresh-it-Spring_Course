package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test-ops")
public class TestOperationsController {

	@GetMapping("/all")
	public   String    showReport2() {
		System.out.println("TestOperationsController.showReport2()");
		return "report2";
	}
	
}
