package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootJpaProj04CustomMethodsFinderMethodsApplication;
import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Component
public class CustomFinderMethodsTestRunner implements CommandLineRunner {

   @Autowired
	private  IDoctorRepository  docRepo;

   
	@Override
	public void run(String... args) throws Exception {
		/*	List<Doctor>  list=docRepo.findByDnameEquals("raja");
			list.forEach(System.out::println);
			System.out.println("==================");
			docRepo.readByDnameIs("raja").forEach(System.out::println);
			System.out.println("==================");
			docRepo.getByDname("raja").forEach(System.out::println);
		*/	
		
		   //docRepo.findByFeeBetween(500, 2000).forEach(System.out::println);
			/* docRepo.findByAddrsStartingWith("h").forEach(System.out::println);
			 docRepo.findByAddrsEndingWith("d").forEach(System.out::println);
			 docRepo.findByAddrsContaining("a").forEach(System.out::println);
			*/
		
		   // docRepo.findByFeeGreaterThanEqualAndFeeLessThanEqualOrderByExpertAsc(500.0, 2000.0).forEach(System.out::println);
		     //docRepo.findByExpertInOrFeeBetween(List.of("cardio","ortho"), 500.0, 2000.0).forEach(System.out::println);
		
			/*	Doctor doc=docRepo.findByDnameEquals("raja11");
				  if(doc!=null)
					   System.out.println("doctor details are ::"+doc);
				  else
			      System.out.println("Doctor is not found");		  */
		
		  Optional<Doctor>  opt=docRepo.readByDnameEquals("raja");
		    if(opt.isPresent()) {
		    	 System.out.println("Doctor details are::"+opt.get());
		    }
		    else {
		    	System.out.println("Doctor not found");
		    }
		   
	}

}
