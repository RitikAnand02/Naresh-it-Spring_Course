package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season-api")
public class SeasonFinderOperationMs {
  
	@Value("${spring.application.instance-id}")
	private String instance_id;
	
	@GetMapping("/show")
	public ResponseEntity<String> showSeason(){
		LocalDateTime ldt =LocalDateTime.now();
		
		int month=ldt.getMonthValue();
		
		String name = null;
		
		if(month>=7 && month<=10)
			name="Rainy Season";
		else if (month>=3 && month<=6)
			name="Summer Season";
		else
			name="Winter Season";
		
		//improve the output 
		name=name+"---"+instance_id;
		
		//return the response
		return new ResponseEntity<String>(name,HttpStatus.OK);
		
	}
	
}
