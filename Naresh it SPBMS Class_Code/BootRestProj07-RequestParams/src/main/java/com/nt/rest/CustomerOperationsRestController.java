package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsRestController {
	
	
	/*@GetMapping("/process")
	public  ResponseEntity<String>  processData(@RequestParam("cno") int no,
			                                                                           @RequestParam("cname") String name){
		System.out.println("reuqest param values ::"+no+"...."+name);
		
		return  new ResponseEntity<String>(no+"..."+name,HttpStatus.OK);
		
	}*/
	
	/*	@GetMapping("/process")
		public  ResponseEntity<String>  processData(@RequestParam int cno,
				                                                                           @RequestParam String cname){
			System.out.println("reuqest param values ::"+cno+"...."+cname);
			
			return  new ResponseEntity<String>(cno+"..."+cname,HttpStatus.OK);
			
		}
	*/
	
	/*@GetMapping("/process")
	public  ResponseEntity<String>  processData(@RequestParam(required = false) Integer cno,
			                                                                           @RequestParam(required = false) String cname){
		System.out.println("reuqest param values ::"+cno+"...."+cname);
		
		return  new ResponseEntity<String>(cno+"..."+cname,HttpStatus.OK);
		
	}*/
	
	@GetMapping("/process")
	public  ResponseEntity<String>  processData(@RequestParam(defaultValue = "1001") Integer cno,
			                                                                           @RequestParam(defaultValue = "kabir") String cname){
		System.out.println("reuqest param values ::"+cno+"...."+cname);
		
		return  new ResponseEntity<String>(cno+"..."+cname,HttpStatus.OK);
		
	}
	
}
