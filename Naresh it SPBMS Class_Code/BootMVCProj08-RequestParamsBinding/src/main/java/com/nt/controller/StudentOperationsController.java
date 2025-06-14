//StudentOperationsController.java
package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class StudentOperationsController {
	
	/*@GetMapping("/data")
	public  String   processData(@RequestParam("sno") int no,
			                                           @RequestParam("sname") String name) {
		System.out.println(no+" ------   "+name);
		return "show_result";
	}*/
	
	/*@GetMapping("/data")
	public  String   processData(@RequestParam int sno,
			                                           @RequestParam(required = false) String sname) {
		System.out.println(sno+" ------   "+sname);
		return "show_result";
	}*/
	
	/*@GetMapping("/data")
	public  String   processData(@RequestParam(defaultValue ="1001") int sno,
			                                           @RequestParam(defaultValue = "rakesh") String sname) {
		System.out.println(sno+" ------   "+sname);
		return "show_result";
	}
	*/
	
	/*	@GetMapping("/data")
		public  String   processData(@RequestParam(required=false) Integer sno,
				                                           @RequestParam(defaultValue = "rakesh") String sname) {
			System.out.println(sno+" ------   "+sname);
			return "show_result";
		}*/
	
	/*@GetMapping("/data")
	public  String   processData(@RequestParam Integer sno,
			                                           @RequestParam String sname,
			                                           @RequestParam(name="sadd")  String sadd[],
			                                           @RequestParam(name="sadd")  List<String> saddList,
			                                           @RequestParam(name="sadd")  Set<String> saddSet ) {
		System.out.println(sno+" ------   "+sname+"....."+Arrays.toString(sadd)+"....."+saddList+"......"+saddSet);
		return "show_result";
	}*/
	
	/*@GetMapping("/data")
	public  String   processData(@RequestParam Integer sno,
	                                                   @RequestParam String sname,
	                                                    @RequestParam(name="sadd")  String sadd) {
		System.out.println(sno+" ------   "+sname+"......."+sadd);
		
		return  "show_result";
	}*/
	
	@Autowired
	private  ServletContext sc;
	@Autowired
	private  ServletConfig cg;
	
	@GetMapping("/data")
	public  String   process(HttpServletRequest req,HttpServletResponse res,HttpSession ses) {
		System.out.println("web application name::"+sc.getContextPath());
		System.out.println("DS Logical name::"+cg.getServletName());
		System.out.println("request uri ::"+req.getRequestURI());
		System.out.println("res obj class name::"+res.getClass());
		return "show_result";
		
	}

	
	
	
	
	
	

}
