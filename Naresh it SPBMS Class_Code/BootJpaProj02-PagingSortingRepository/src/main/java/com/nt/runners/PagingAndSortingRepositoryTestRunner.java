package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
import com.nt.service.IDoctorMgmtService;

@Component
public class PagingAndSortingRepositoryTestRunner implements CommandLineRunner {

   
	@Autowired
	private  IDoctorMgmtService  docService;


   

	@Override
	public void run(String... args) throws Exception {
		/*	try {
				docService.showDoctorsAsSorted(true, "dname","expert").forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*		  try {
					  Page<Doctor>  page=docService.showDoctorDataByPageNo(2, 3);
					  List<Doctor>  list=page.getContent();
					  System.out.println("recrods of "+(page.getNumber()+1)+"/"+page.getTotalPages());
					  list.forEach(doc->{
						  System.out.println(doc);
					  });
				  }
				  catch(Exception e) {
					  e.printStackTrace();
				  }*/
		/*		    try {
				    	 Page<Doctor>  page=docService.showDoctorsByPageNoSorted(2, 4,true,"dname");
				   	  System.out.println("recrods of "+(page.getNumber()+1)+"/"+page.getTotalPages());
				   	    page.forEach(System.out::println);
				   	    System.out.println("Current page No::"+(page.getNumber()+1));
				   	    System.out.println("Total  no.of  page ::"+page.getTotalPages());
				   	    System.out.println("records count in current page ::"+page.getNumberOfElements());
				   	    System.out.println(" is the current page is first page::"+page.isFirst());
				   	    System.out.println(" is the current page is last page::"+page.isLast());
				   	    
				   	    
				    }
				    catch(Exception e) {
				    	e.printStackTrace();
				    }
		*/	
		
		  try {
			   docService.showDoctorsByPagination(2);
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  
	}//main
}//class
