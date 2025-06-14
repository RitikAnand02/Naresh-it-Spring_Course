package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.service.IDoctorMgmtService;
import com.nt.vo.DoctorVO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/doctor")
public class DoctorOperationsController {
	@Autowired
	private IDoctorMgmtService  docService;
	
	
	@GetMapping("/home")
	public   String  showHomePage() {
		//return LVN
		return "welcome";
	}
	
	
	@GetMapping("/report")//for report page   (G --Get)
	public   String    showReport(Map<String,Object> map){
		System.out.println("DoctorOperationsController.showReport()");
		//use service
		List<DoctorVO>  listVO=docService.showDoctors();
		//keep the result in  shared Memory
		map.put("resultList", listVO);
		//return LVN
		return "show_report";
		
	}
	
	@GetMapping("/register")  //For launching register doctor related form page
	public    String  showRegisterDoctorFormPage(@ModelAttribute("doc") DoctorVO doctor) {
		System.out.println("DoctorOperationsController.showRegisterDoctorFormPage()");
		//return LVN
		return  "register_doctor_form";
		
	}
	
	/*@PostMapping("/register")  //Bad Code
	public  String    processRegisterDoctor(Map<String,Object>map , @ModelAttribute("doc") DoctorVO docVO) {
		//use service
		String msg=docService.regsisterDoctor(docVO);
		List<DoctorVO>  listVO=docService.showDoctors();
	    //keep the results in shared memory
		map.put("resultMsg", msg);
		map.put("resultList", listVO);
		//return  LVN
		return  "show_report";
		
	}*/
	
	/*@PostMapping("/register")  //improvement1  (P-POST)
	public  String    processRegisterDoctor(Map<String,Object>map , 
			                                                                     @ModelAttribute("doc") DoctorVO docVO) {
		System.out.println("DoctorOperationsController.processRegisterDoctor()");
		//use service
		String msg=docService.regsisterDoctor(docVO);
	    //keep the results in shared memory
		map.put("resultMsg", msg);
		//return  LVN
		return  "redirect:report";  // R--Redirect
		
	}*/
	
	
	/*	@PostMapping("/register")  //improvement2  (P-POST)
		public  String    processRegisterDoctor(RedirectAttributes  attrs , 
				                                                                     @ModelAttribute("doc") DoctorVO docVO) {
			System.out.println("DoctorOperationsController.processRegisterDoctor()");
			//use service
			String msg=docService.regsisterDoctor(docVO);
		    //keep the results in shared memory
		     attrs.addFlashAttribute("resultMsg", msg);
			//return  LVN
			return  "redirect:report";  // R--Redirect
			
		}
	*/
	
	@PostMapping("/register")  //improvement2  (P-POST)
	public  String    processRegisterDoctor(HttpSession ses , 
			                                                                     @ModelAttribute("doc") DoctorVO docVO) {
		System.out.println("DoctorOperationsController.processRegisterDoctor()");
		//use service
		String msg=docService.regsisterDoctor(docVO);
	    //keep the results in shared memory
	     ses.setAttribute("resultMsg", msg);
		//return  LVN
		return  "redirect:report";  // R--Redirect
	}
	
	@GetMapping("/edit")  //For launching edit form page 
	public  String  showEditDoctorFormPage(@RequestParam("no") int id,
			                                                              @ModelAttribute("doc") DoctorVO doctorVO) {
		//use service
		DoctorVO  doctorVO1=docService.showDoctorById(id);
		//copy  doctorVO1 object data to DoctorVO object
		 BeanUtils.copyProperties(doctorVO1, doctorVO);
		 //return LVN
		 return "edit_doctor_form";
	}
	
	
	@PostMapping("/edit")  //improvement2  (P-POST)
	public  String    processEditDoctor(RedirectAttributes attrs , 
			                                                                     @ModelAttribute("doc") DoctorVO docVO) {
		System.out.println("DoctorOperationsController.processEditDoctor()");
		//use service
		String msg=docService.updateDoctor(docVO);
	    //keep the results in shared memory
	     attrs.addFlashAttribute("resultMsg", msg);
		//return  LVN
		return  "redirect:report";  // R--Redirect
	}
	
	@GetMapping("/delete")
	public  String  removeDoctor(@RequestParam("no") int did,RedirectAttributes attrs) {
		//use service
		String msg=docService.removeDoctorById(did);
		//keep the result as Model Attribute
		attrs.addFlashAttribute("resultMsg", msg);
		//return LVN
		return "redirect:report";
	}
	
	
	
}
