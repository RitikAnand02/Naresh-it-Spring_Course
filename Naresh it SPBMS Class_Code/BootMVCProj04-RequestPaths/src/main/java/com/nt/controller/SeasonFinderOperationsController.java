package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.service.ISeasonFinderService;

@Controller
@RequestMapping("/season-ops")
public class SeasonFinderOperationsController {
	@Autowired
	private  ISeasonFinderService  service;
	
	
	@GetMapping
	public  String   showHomePage1() {
		System.out.println("SeasonFinderOperationsController.showHomePage1()");
		//return lvn
		return "welcome";
	}
	
	/*@PostMapping
	public  String   showHomePage2() {
		System.out.println("SeasonFinderOperationsController.showHomePage2()");
		//return lvn
		return "welcome";
	}*/
	
	
	/*@RequestMapping("/season")
	public   String  displaySeason(Map<String,Object> map) {
		//use service
		String result=service.findSeason();
		//put the result in model attribute
		map.put("seasonName", result);
		//return LVN
		return "show_result";
	}*/
	
	
	/*//@RequestMapping(value="/report",method = RequestMethod.GET)
	@GetMapping("/report")
	@PostMapping("/report")
	public    String   showReport1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return  "report1";
	}
	*/
	/*//@RequestMapping(value="/report",method=RequestMethod.POST)
	@PostMapping("/report")
	public  String  showReport2() {
		System.out.println("SeasonFinderOperationsController.showReport2()");
		return  "report2";
	}*/
	
	
	/*//@RequestMapping({"/report1","/report2","/report3"})
	@RequestMapping(value={"/report1","/report2","/report3"})
	public    String   showReport1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return  "report1";
	}*/
	
	@PostMapping("/all")
	public   String    showReport1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return "redirect:/test-ops/all";
	}
	

}
