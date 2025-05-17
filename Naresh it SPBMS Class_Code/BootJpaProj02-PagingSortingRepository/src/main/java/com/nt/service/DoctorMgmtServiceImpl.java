package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service("docService")
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private  IDoctorRepository  docRepo;

	@Override
	public Iterable<Doctor> showDoctorsAsSorted(boolean ascOrder, String... props) {
		//create Sort object
		 Sort  sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		 // fetch  the object
		 Iterable<Doctor>  it=docRepo.findAll(sort);
		return it;
	}

	@Override
	public Page<Doctor> showDoctorDataByPageNo(int pageNo, int pageSize) {
		// create Pageable object having inputs
		    Pageable pageable=PageRequest.of(pageNo-1, pageSize);		
		    //Load the objects
		    Page<Doctor>  page=docRepo.findAll(pageable);
		    
		    return page;
	}

	@Override
	public Page<Doctor> showDoctorsByPageNoSorted(int pageNo, int pageSize, boolean ascOrder, String... props) {
		  //prepare Sort object
		 Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		// create Pageable object having inputs
	    Pageable pageable=PageRequest.of(pageNo-1, pageSize,sort);		
	    //Load the objects
	    Page<Doctor>  page=docRepo.findAll(pageable);
		return page;
	}
	
	@Override
	public void showDoctorsByPagination(int pageSize) {
		 // get total records count
		long count=docRepo.count();
		//get pagesCount
		long  pagesCount=count/pageSize;
		if(count%pageSize!=0)
                   pagesCount++;
              //display record page by page
                   for(int i=0;i<pagesCount;++i) {
                	   //prepare Pageable object
                	   Pageable pageable=PageRequest.of(i, pageSize);
                	   // get each page records
                	      Page<Doctor> page=docRepo.findAll(pageable);
                	      System.out.println("records  of  "+(page.getNumber()+1)+"/"+page.getTotalPages());
                	      page.forEach(System.out::println);
                   }//for
     	}//method

}//class
