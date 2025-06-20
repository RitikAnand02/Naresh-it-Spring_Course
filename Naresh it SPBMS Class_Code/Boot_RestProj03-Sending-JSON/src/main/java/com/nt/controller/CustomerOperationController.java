package com.nt.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationController {

	/*@GetMapping("/report") 
	public ResponseEntity<Customer> showData(){ 
	System.out.println("CustomerOperationController.showData()");	
	Customer cust=new Customer(1001,"raja",54566.66f); 
	HttpStatus status=HttpStatus.OK; 
	return new ResponseEntity<Customer>(cust,status); 
	} */
	
	/*	@GetMapping("/report1") 
		public ResponseEntity<Customer> showData1(){ 
		System.out.println("CustomerOperationController.showData1()");
		Customer cust=new Customer(1001,"raja",54566.66f, 
		new String[] {"read","green","blue"}, 
		List.of("10th","10+2","B.Tech"), Set.of(544535345L,7576575L,6465654L), 
		Map.of("aadhar", 35345435L, "panNo", 354353534L), new Company        ("SAMSUNG","hyd","Eletronics",4000)); 
		
		HttpStatus status=HttpStatus.OK; 
		return new ResponseEntity<Customer>(cust,status); 
		} */
	
	@GetMapping("/report2") 
	public ResponseEntity<List<Customer>> showData2(){ 
	System.out.println("CustomerOperationController.showData2()");	
	Customer cust1=new Customer(1001,"raja","hyd", 90.0f); 
	Customer cust2=new Customer(1002,"mahesh", "vizag", 90.0f); 
	Customer cust3=new Customer(1003,"ramana","blore", 90.0f); 
	return new ResponseEntity<List<Customer>>(List.of(cust1, cust2,cust3), HttpStatus.OK); 
	} 
}
