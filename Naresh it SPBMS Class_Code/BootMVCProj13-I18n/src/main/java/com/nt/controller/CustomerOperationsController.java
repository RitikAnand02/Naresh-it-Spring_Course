//CustomerOperationsController.java
package com.nt.controller;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Customer;

@Controller
public class CustomerOperationsController {
	
	
	@GetMapping("/")
	public  String   showHomePage(Map<String,Object> map) {
		//add model attributes
		map.put("sysDate", new Date());
		map.put("billamt",new Random().nextInt(500000));
		map.put("avg",0.13);
		System.out.println("CustomerOperationsController.showHomePage()");
		return  "welcome";
	}
	
	@GetMapping("/register")
	public  String  showCustomerRegisterPage(@ModelAttribute("cust") Customer cust) {
		System.out.println("CustomerOperationsController.showCustomerRegisterPage()");
		//return LVN
		return "customer_register_form";
	}

}
