package com.nt.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee-api")
@RefreshScope
public class EmployeeOperationsController {
	@Value("${db.user}")
	private   String   username;
	@Value("${db.pwd}")
	private  String  password;
	
	@GetMapping("/show")
	public   ResponseEntity<String>  showData(){
		return  new ResponseEntity<String>("DB Properties::"+username+"..."+password, HttpStatus.OK);
	}

}
