//CustomerOperationsRestController.java
package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsRestController {
	@PostMapping("/register-company")
	public   ResponseEntity<String>   registerCompany(@RequestBody Company company){
		System.out.println("CustomerOperationsRestController.registerCompany()");
		System.out.println("company object data::"+company);
		return new ResponseEntity<String>(company.toString(),HttpStatus.OK);
	}
	
	@PostMapping("/register-customer")
	public   ResponseEntity<String>   registerCustomer(@RequestBody Customer cust){
		System.out.println("CustomerOperationsRestController.registerCompany()");
		System.out.println("company object data::"+cust);
		return new ResponseEntity<String>(cust.toString(),HttpStatus.OK);
	}
	
	@PostMapping("/register-allcompanies")
	public   ResponseEntity<String>   registerAllCustomers(@RequestBody List<Company> listcomps){
		System.out.println("CustomerOperationsRestController.registerCompany()");
		System.out.println("company object data::"+listcomps);
		return new ResponseEntity<String>(listcomps.toString(),HttpStatus.OK);
	}


}
