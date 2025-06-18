package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {

	@GetMapping("/report")
	public ResponseEntity<String> showCustomerReport(){
		System.out.println("CustomerOperationController.showCustomerReport()(GET)");
		return new ResponseEntity<String>("Select Operation",HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(){
		System.out.println("CustomerOperationController.showCustomerReport()(POST)");
		return new ResponseEntity<String>("Insert Operation",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer(){
		System.out.println("CustomerOperationController.showCustomerReport()(PUT)");
		return new ResponseEntity<String>("Update Operation",HttpStatus.OK);
	}
	
	@PatchMapping("/updateEmail")
	public ResponseEntity<String> updateEmailCustomer(){
		System.out.println("CustomerOperationController.showCustomerReport()(PATCH)");
		return new ResponseEntity<String>("Partial Update Operation",HttpStatus.OK);
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeCustomer(){
		System.out.println("CustomerOperationController.showCustomerReport()(DELETE)");
		return new ResponseEntity<String>("Delete Operation",HttpStatus.OK);
	}
}
