package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import com.nt.service.PoliticianMgmtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Politiician;
import com.nt.service.IPoliticianMgmtService;

@Component
public class JODADateTimeTestRunner implements CommandLineRunner {

    
	@Autowired
	private  IPoliticianMgmtService  politicianService;


    

	@Override
	public void run(String... args) throws Exception {
		/*		//save the object
				try {
					Politiician  politician=new Politiician("rajesh", "vizag",
							                                                             LocalDate.of(1999, 10, 20),
							                                                             LocalTime.of(11, 20),
							                                                             LocalDateTime.of(2011,10,21,10,20));
					String msg=politicianService.registerPolitician(politician);
					System.out.println(msg);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			System.out.println("===========================");
			
			try {
				politicianService.showAllPoliticians().forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/	
		
		  float age=politicianService.showPoliticialAgeById(1);
		   System.out.println("Politician age::"+age);
	}
}
