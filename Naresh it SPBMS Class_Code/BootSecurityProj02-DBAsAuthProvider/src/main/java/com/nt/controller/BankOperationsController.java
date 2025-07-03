package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationsController {
	
	
	@GetMapping("/")
	public  String  showHome() {
		//return LVN
		return  "welcome";
	}
	
	@GetMapping("/balance")
	public  String   showBalnace(Map<String,Object> map) {
		 //add model attributes
		double  amount=new Random().nextDouble(54545545.0);
		map.put("balance",amount);
		return "show_balance";
	}
	
	@GetMapping("/offers")
	public    String showOffers(Map<String,Object> map) {
		 //add model attributes
		map.put("HLROI","7%");
		map.put("CLROI","12%");
		map.put("GLROI","9%");
		map.put("ELROI", "6%");
		return "show_offers";
	}
	
	@GetMapping("/loan")
	public    String apporve(Map<String,Object> map) {
		 //add model attributes
		long amount=new Random().nextLong(100000);
		map.put("loanAmount",amount);
		return "loan";
	}
	
	@GetMapping("/denied")
	public   String   accessDienied() {
		//return LVN
		return "access_denied";
	}
	

}
