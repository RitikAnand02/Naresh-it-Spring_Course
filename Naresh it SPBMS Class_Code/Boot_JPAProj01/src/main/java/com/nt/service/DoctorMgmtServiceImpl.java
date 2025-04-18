package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

@Service("docService")
public class DoctorMgmtServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepo docRepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		Doctor doc = docRepo.save(doctor);
		return "Doctor Obj is Saved"+doc.getDid();
	}

}
