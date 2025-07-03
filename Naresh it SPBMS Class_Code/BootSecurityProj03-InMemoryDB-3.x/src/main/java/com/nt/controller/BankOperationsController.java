package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")  //global path
public class BankOperationsController {

	
	@GetMapping("/welcome")  //endpoint1
	public  ResponseEntity<String>  showHome() {
		return new ResponseEntity<String>("welcome to home page ::",HttpStatus.OK);
	}
	
	
	@GetMapping("/offers")//endpoint2
	public  ResponseEntity<String>  showOffers() {
		return new ResponseEntity<String>("offers page ",HttpStatus.OK);
	}
	
	@GetMapping("/loan_approve")//endpoint3
	 @PreAuthorize("hasAuthority('MANAGER')") 
	public   ResponseEntity<String> approveLoanPage() {
		int  amount=new Random().nextInt(1200000);
		return new ResponseEntity<String>("Loan Approve Page --- the  amount is::"+amount,HttpStatus.OK);
	}
	
	@GetMapping("/balance")////endpoint4
	@PreAuthorize("hasAnyAuthority('MANAGER','CUSTOMER')") 
	public    ResponseEntity<String>    showBalancePage() {
		int  amount=new Random().nextInt(200000);
		return  new ResponseEntity<String>("Balance is ::"+amount,HttpStatus.OK);
	}
	
	
}
