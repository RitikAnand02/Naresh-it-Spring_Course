package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.DoctorMgmtServiceImpl;

@Component
public class TestRunnerDoctor implements CommandLineRunner{
	@Autowired
	private DoctorMgmtServiceImpl docService;

	@Override
	public void run(String... args) throws Exception {
		Doctor doc = new Doctor();
		doc.setDname("Ritk");
		doc.setSpecialization("cardio");
		doc.setIncome(90000.0);
		String msg=docService.registerDoctor(doc);
		System.out.println("Result ::"+msg);
		
	}

}
