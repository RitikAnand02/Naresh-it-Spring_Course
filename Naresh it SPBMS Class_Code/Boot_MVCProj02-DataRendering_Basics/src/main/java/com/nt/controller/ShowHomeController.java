package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	/*@RequestMapping("/home")
	public String showHome() {
		return "welcome";
	}*/
	
	/*@RequestMapping("/")
	public String showHome() {
		// return LVN
		return "welcome";
	}*/
	
	/*@RequestMapping("/process")
	public String process(Map<String,Object> map) {
		System.out.println("ShowHomeController.process()"+map.getClass());
		map.put("attr1", "val1");
		map.put("sysdt", LocalDateTime.now());
		// return LVN
		return "show";
	}*/
	
	/*	@RequestMapping("/process")
		public String process(Model model) {
			System.out.println("ShowHomeController.process()"+model.getClass());
			model.addAttribute("attr1", "val1");
			model.addAttribute("sysdt", LocalDateTime.now());
			
			// return LVN
			return "show";
		}*/
	
	/*@RequestMapping("/process")
	public String process(ModelMap map) {
		System.out.println("ShowHomeController.process()"+map.getClass());
		map.addAttribute("attr1", "val1");
		map.addAttribute("sysdt", LocalDateTime.now());
		
		// return LVN
		return "show";
	}*/
	
	/*@RequestMapping("/show")
	public Model process() {
		Model model = new BindingAwareModelMap();
		model.addAttribute("attr1", "val1");
		model.addAttribute("sysdt", LocalDateTime.now());
		
		// return LVN
		return model;
	}*/
	
	/*	@RequestMapping("/show")
		public Map<String,Object> process() {
			Map<String,Object> map = new HashMap();
			map.put("attr1", "val1");
			map.put("sysdt", LocalDateTime.now());
			
			// return LVN
			return map;
		}*/
	
	/*@RequestMapping("/show")
	public ModelAndView process() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("attr1", "val1");
		mav.addObject("sysdt", LocalDateTime.now());
		
		// return LVN
		return mav;
	}*/
	
	@RequestMapping("/show")
	public String process(Map<String, Object> map) {
		map.put("attr1", "val1");
		map.put("sysdt", new Date());
		
		// return LVN
		return null;
	}
}
