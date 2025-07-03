package com.nt.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsController {
	
	@GetMapping("/company")
	public   ResponseEntity<Company>  showCompanyData(){
		System.out.println("CustomerOperationsController.showCompanyData()");
		Company  comp=new Company(1001, "rajesh", "hyd", 100, 500019L);
		return new ResponseEntity<Company>(comp,HttpStatus.OK);
	}
	
	@GetMapping("/customer")
	public  ResponseEntity<Customer>  showCustomerData(){
		System.out.println("CustomerOperationsController.showCustomerData()");
		Customer customer=new Customer(1001, "raja", 8999.0, new String[] {"red","green","blue"},
				                                                             List.of("srinvas","mukesh","rajesh"),
				                                                              Set.of(999999L,7777777L,4545545L,65566555L), 
				                                                              Map.of("aaadhar",4656566,"voterid",65656556),
				                                                              new Company(4545, "HCL", "hyd", 100, 567767L));
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/all-customers")
	public    ResponseEntity<List<Company>>  showAllCompaniesData(){
		System.out.println("CustomerOperationsController.showAllCompaniesData()");
		Company comp1=new Company(1001, "HCL", "hyd", 100, 500018L);
		Company comp2=new Company(1002, "Wipro", "hyd", 200, 500032L);
		Company comp3=new Company(1003, "CTS", "mumbai", 300, 500089L);
		return  new ResponseEntity<List<Company>>(List.of(comp1,comp2,comp3),HttpStatus.CREATED);
	}
	
	@GetMapping("/all-customers1")
	public    List<Company>  showAllCompaniesData1(){
		System.out.println("CustomerOperationsController.showAllCompaniesData1()");
		Company comp1=new Company(1001, "HCL", "hyd", 100, 500018L);
		Company comp2=new Company(1002, "Wipro", "hyd", 200, 500032L);
		Company comp3=new Company(1003, "CTS", "mumbai", 300, 500089L);
		return  List.of(comp1,comp2,comp3);
	}

}
