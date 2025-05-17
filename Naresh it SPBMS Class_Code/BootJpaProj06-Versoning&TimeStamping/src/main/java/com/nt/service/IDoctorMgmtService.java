package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService {

	public  String   registerDoctor(Doctor doctor);
	public   String    modifyDoctorFee(int id , double hikePercent);
	public   Doctor    showDoctorById(int id);
	
	
}
