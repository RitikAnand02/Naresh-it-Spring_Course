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

	
	@GetMapping("/welcome")
	public  ResponseEntity<String>  showHome() {
		return new ResponseEntity<String>("welcome to home  Page::",HttpStatus.OK);
	}
	
	
	@GetMapping("/offers")
	public  ResponseEntity<String>  showOffers() {
		return new ResponseEntity<String>("offers page ",HttpStatus.OK);
	}
	
	@GetMapping("/loan_approve")
	 @PreAuthorize("hasAuthority('MANAGER')")   //specifying  authrorization
	public   ResponseEntity<String> approveLoan() {
		int  amount=new Random().nextInt(1200000);
		return new ResponseEntity<String>("Loan Approved , the  amount is::"+amount,HttpStatus.OK);
	}
	
	@GetMapping("/balance")
	@PreAuthorize("hasAnyAuthority('MANAGER','CUSTOMER')")   //specifying the authrorization
	public    ResponseEntity<String>    showBalance() {
		int  amount=new Random().nextInt(200000);
		return  new ResponseEntity<String>("Balance is ::"+amount,HttpStatus.OK);
	}
	

	
}
