//StudentOperationsController.java
package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {
	
	@RequestMapping("/")
	public  String  showHomePage() {
		//return LVN
		return "welcome";
	}
	
	@GetMapping("/register")  //For launching the form page
	public  String   showStudentRegistrationFormPage(@ModelAttribute("stud") Student st) {
		//return LVN
		return  "student_register_form";
	}
	
	@PostMapping("/register")
	public  String   registerStudent(Map<String,Object> map,@ModelAttribute("stud") Student st) {
		System.out.println("Model class obj data ::"+st);
		//write b.logic
		String result=null;
		if(st.getAvg()<35)
			result="Fail";
		else if(st.getAvg()<50)
			result="Third Grade";
		else if(st.getAvg()<60)
			result="Second Grade";
		else
			result="First Grade";
		//keep the result in model attribute
		map.put("resultMsg", result);
		
		//return LVN
		return "show_result";
		
	}

}
