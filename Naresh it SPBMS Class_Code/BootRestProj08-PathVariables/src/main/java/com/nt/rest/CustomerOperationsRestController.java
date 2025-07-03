//CustomerOperationsRestController.java
package com.nt.rest;

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
@RequestMapping("/customer-api")
public class CustomerOperationsRestController {
	
	/*	@GetMapping("/process/{cno}/{cname}")
		public  ResponseEntity<String> showData(@PathVariable("cno") int no,
				                                                                      @PathVariable("cname") String name){
			System.out.println("Path variable values ::"+no+"...."+name);
			
			return new ResponseEntity<String>(no+"..."+name,HttpStatus.OK);
			
		}
	*/
	/*	@GetMapping(value={"/process/{cno}/{cname}","/process/{cno}","/process"})
		public  ResponseEntity<String> showData(@PathVariable(required = false) Integer cno,
				                                                                      @PathVariable(required = false) String cname){
			System.out.println("Path variable values ::"+cno+"...."+cname);
			return new ResponseEntity<String>(cno+"..."+cname,HttpStatus.OK);
			
		}
	*/
	
	/*@GetMapping("/report/cno/cname")
	public  ResponseEntity<String> showData1(@PathVariable(required = false) Integer cno,
	        @PathVariable(required = false) String cname){
		System.out.println("CustomerOperationsRestController.showData1()");
		return new ResponseEntity<String>("from ShowData1",HttpStatus.OK);
	}
	
	@GetMapping("/report/{cno}/{cname}")
	public  ResponseEntity<String> showData2(@PathVariable(required = false) Integer cno,
	                                                                                @PathVariable(required = false) String cname){
		System.out.println("CustomerOperationsRestController.showData2()");
		return new ResponseEntity<String>("from ShowData2",HttpStatus.OK);
	}
	
	@GetMapping("/report/{cno}/cname")
	public  ResponseEntity<String> showData3(@PathVariable(required = false) Integer cno,
	                                                                                @PathVariable(required = false) String cname){
		System.out.println("CustomerOperationsRestController.showData3()");
		return new ResponseEntity<String>("from ShowData3",HttpStatus.OK);
	}
	
	
	
	@GetMapping("/report/cno/{cname}")
	public  ResponseEntity<String> showData4(@PathVariable(required = false) Integer cno,
	                                                                                @PathVariable(required = false) String cname){
		System.out.println("CustomerOperationsRestController.showData4()");
		return new ResponseEntity<String>("from ShowData4",HttpStatus.OK);
	}*/
	
	
	@PostMapping("/report1")
	@GetMapping("/report2")
	@PutMapping("/report3")
	@PatchMapping("/report4")
	@DeleteMapping("/report5")
	public  ResponseEntity<String> showData4(){
		System.out.println("CustomerOperationsRestController.showData4()");
		return new ResponseEntity<String>("from ShowData4",HttpStatus.OK);
	}
	
	
}
