package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Customer;

@Controller
public class ShowHomeController {

	/*	@GetMapping("/home")
		public  String   showHome(Map<String,Object> map) { 
			System.out.println("ShowHomeController.showHome()");
		  //add Model class obj  as the model attribute to shared memory
		         Customer cust=new Customer(1001,"rakesh","hyd",8999.9f);
		         map.put("custData", cust);
			
				map.put("nickNames", new String[] {"raja","king","maharaj"});
				map.put("friends", List.of("srinivas","mahesh","suresh"));
				map.put("phones", Set.of(999999L,888888L,77777777L));
				map.put("idDetails", Map.of("aadhar",54545L,"voterid",454545L,"panCard",4545454L));
			
		         return "report";
		}*/
	
	@GetMapping("/home")
	public  String   showHome(Map<String,Object> map) { 
		System.out.println("ShowHomeController.showHome()");
	  //add List of Model class objs  as the model attribute to shared memory
	         Customer cust1=new Customer(1001,"rakesh","hyd",8991.9f);
	         Customer cust2=new Customer(1002,"rajesh","vizag",7999.9f);
	         Customer cust3=new Customer(1004,"suresh","delhi",6999.9f);
	          List<Customer>  list=List.of(cust1,cust2,cust3);
	         
	         map.put("custList", list);
	         return "report";
	}	

}
