package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import com.nt.BootJpaProj06VersioningAndTimeStamping;
import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
import com.nt.service.IDoctorMgmtService;

@Component
public class VersioningAndTimeStampingTestRunner implements CommandLineRunner {


	@Autowired
	private  IDoctorMgmtService  docService;


	@Override
	public void run(String... args) throws Exception {
		
		/*	try {
				Doctor doctor=new Doctor("Suresh", "delhi", "cardio", 700.0);
				String msg=docService.registerDoctor(doctor);
				System.out.println(msg);
				Doctor doc=docService.showDoctorById(1);
				System.out.println("update count ::"+doc.getUpdateCount()+"inserted On:"+doc.getRegisteredOn());
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
			try {
				 String  msg=docService.modifyDoctorFee(1, 20.0);
				 System.out.println(msg);
				Doctor doc=docService.showDoctorById(1);
				 System.out.println("update count::"+doc.getUpdateCount()+", inserted On  "+doc.getRegisteredOn()+",lastly updated On"+doc.getLastlyUpdatedOn());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		
		  
	}//main
}//class
