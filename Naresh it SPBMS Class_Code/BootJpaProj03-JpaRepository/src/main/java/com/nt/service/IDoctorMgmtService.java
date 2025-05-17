package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService {

	public  String   removeDoctorsByIdsInBatch(Iterable<Integer> ids);
	public   List<Doctor>  showDoctorsByExampleData(Doctor doctor , boolean ascOrder , String ...props);
	public   Optional<Doctor>  showDoctorById(int id);
	public  Doctor   fetchDoctorById(int id);
	
}
