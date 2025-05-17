package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service("docService")
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private  IDoctorRepository  docRepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		doctor.setCreatedBy(System.getProperty("user.name"));
		doctor.setActive_SW("active");
		int idVal=docRepo.save(doctor).getDid();
		return "Doctor obj is saved with id values:"+idVal;
	}
	
	@Override
	public String modifyDoctorFee(int id, double hikePercent) {
		//Load object
		Optional<Doctor>  opt=docRepo.findById(id);
		if(opt.isPresent()) {
			Doctor doctor=opt.get();
			doctor.setFee(doctor.getFee()+ doctor.getFee()*hikePercent/100.0);
			doctor.setUpdatedBy(System.getProperty("user.name"));
			docRepo.save(doctor);
			return  id+" doctor fee is updated";
		}
		return id+"  doctor is not found for updation";
	}
	
	@Override
	public Doctor showDoctorById(int id) {
		return  docRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
	}



}//class
