package com.nt.runners;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IDoctorRepository;

@Component
public class CustomQueryMethodsTestRunner implements CommandLineRunner {

   @Autowired
	private  IDoctorRepository  docRepo;

   
	@Override
	public void run(String... args) throws Exception {
		/*List<Doctor>  list=docRepo.showDocotorsBySpecializations("cardio", "ortho", "nuero");
		list.forEach(System.out::println);*/
		/*  System.out.println("=============== Bulk Select Entity Query ==========");
		    docRepo.showDoctorsByAddrsAndSpeicialization("hyd", "cardio").forEach(System.out::println);
		    System.out.println("========Bulk=SElect Scalar Query (multiple cols)============");
		    docRepo.showDoctorsDataByFeeRange(400.0,1000.0).forEach(data->{
		    	  for(Object val:data) {
		    		  System.out.print(val+"  ");
		    	  }
		    	  System.out.println();
		    });
		    System.out.println("====Bulk=Select==Scalar =Query (single col)========");
		  docRepo.showDoctorsNameByNameChars("r%").forEach(System.out::println);  
		*/
		
		/*Optional<Doctor>   opt=docRepo.showDoctorByName("raja");
		if(opt.isPresent())
			System.out.println("Doctor details are::"+opt.get());
		else
			System.out.println("Doctor not found");
		System.out.println("====================");
		Object obj=docRepo.showDoctorDataByName("raja");
		Object rowValues[]=(Object[])obj;
		System.out.println(" Doctor  data details are ::"+Arrays.toString(rowValues));
		
		System.out.println("====================");
		double  fee=docRepo.showDoctorFeeByName("raja");
		System.out.println("doctor fee is ::"+fee);
		*/
		
		/*int addrsCount=docRepo.showUniqueDoctorsAddrsCount();
		System.out.println("Adress count::"+addrsCount);
		System.out.println("====================");
		Object row[]=(Object[])docRepo.showDoctorsAggregateData();
		System.out.println(" Doctors count::"+row[0]);
		System.out.println(" Doctors  Sum of Fee values::"+row[1]);
		System.out.println(" Doctors     Avg Fee Value::"+row[2]);
		System.out.println(" Doctors     Min Fee Value::"+row[3]);
		System.out.println(" Doctors     Max Fee Value::"+row[4]);*/
		
		/*int  count=docRepo.modifyDoctorFeeBySpecialization(10.0,"cardio");
		System.out.println("no.of records that are updated::"+count);
		*/
		/*int count=docRepo.removeDoctorsByAddresses("hyd", "vizag", "delhi");
		System.out.println("no.of  doctors the are removed::"+count);
		*/
		LocalDateTime   ldt=docRepo.showSysDateTime();
		System.out.println("system date and time ::"+ldt);
		   
	}

}
