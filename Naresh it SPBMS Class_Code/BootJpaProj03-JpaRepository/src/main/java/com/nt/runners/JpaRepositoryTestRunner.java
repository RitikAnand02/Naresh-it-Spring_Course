package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import com.nt.BootJpaProj03JpaRepositoryApp;
import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
import com.nt.service.IDoctorMgmtService;

@Component
public class JpaRepositoryTestRunner implements CommandLineRunner {

    private final BootJpaProj03JpaRepositoryApp bootJpaProj03JpaRepositoryApp;

   
	@Autowired
	private  IDoctorMgmtService  docService;


    JpaRepositoryTestRunner(BootJpaProj03JpaRepositoryApp bootJpaProj03JpaRepositoryApp) {
        this.bootJpaProj03JpaRepositoryApp = bootJpaProj03JpaRepositoryApp;
    }


	@Override
	public void run(String... args) throws Exception {
		
		/*		try {
					String msg=docService.removeDoctorsByIdsInBatch(List.of(2,6,7,10,35));
					System.out.println(msg);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		*/
		
		/* try {
			 Doctor doctor=new Doctor();
			 //doctor.setDname("raja"); 
			 doctor.setExpert("cardio"); doctor.setFee(1000.0);
			 List<Doctor>  list=docService.showDoctorsByExampleData(doctor, true, "dname","expert");
			 list.forEach(doc->{
				 System.out.println(doc);
			 });
		 }//try
		 catch(Exception e) {
			 e.printStackTrace();
		 }*/
		
		/*	try {
			 Optional<Doctor>  opt=docService.showDoctorById(8);
			    
				if(opt.isPresent()) {
				  Doctor doc=opt.get();
				  System.out.println("doc obj class name::"+doc.getClass());
				  System.out.println("Doctor name:"+doc.getDname());
				}
			}
			catch(Exception e) {
			 e.printStackTrace();
			}
		*/	
		System.out.println("===============================");
		
		try {
			Doctor doc=docService.fetchDoctorById(8);
			System.out.println("doc obj class name::"+doc.getClass()+" ......"+doc.getClass().getSuperclass());
			//System.out.println("doctor name::"+doc.getDname());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		  
	}//main
}//class
