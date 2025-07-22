//SearchServiceOperationsController.java
package com.nt.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search-api")
public class SearchServiceOperationsController {
	
	@GetMapping("/welcome")
	public  ResponseEntity<String>  searchServiceWelcome(){
		return new  ResponseEntity<String>("Welcome to  Search Service of Flipkart.com",HttpStatus.OK);
	}

}
