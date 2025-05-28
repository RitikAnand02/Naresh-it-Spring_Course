package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
public class SeasonOperationController {
	
	@Autowired
	private ISeasonFinderService service;
	
	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String showSeason(Map<String,Object> map) {
		//use service
		String msg = service.findSeason();
		//keep results in Model Attributes 
		map.put("result", msg);
		// return LVN
		return "display";
	}

}
