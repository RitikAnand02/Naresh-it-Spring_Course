package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorMgmtService;

@Component
public class PL_SQLProcedureCallTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorMgmtService  docService;

	@Override
	public void run(String... args) throws Exception {
		//use  service
		List<Doctor>  list=docService.showDoctorsByFeeRange(400.0, 20000.0);
		list.forEach(System.out::println);
		
	}

}
