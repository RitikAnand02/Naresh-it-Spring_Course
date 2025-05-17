package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private EntityManager manager;
	
	
	/*CREATE DEFINER=`root`@`localhost` PROCEDURE `P_GET_DOCTORS_BY_FEE`(IN startFee float , IN endFee float)
			BEGIN
			   select  *  from  jpa_doctor  where doctor_fee>=startFee and doctor_fee<=endFee;
	
			END
	*/	
	
	@Override
	public List<Doctor> showDoctorsByFeeRange(double start, double end) {
		// create StoreProcedure  object pointing to PL/SQL Procedure
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_FEE",Doctor.class);
		//register both IN ,OUT params
		query.registerStoredProcedureParameter(1, Integer.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Integer.class,ParameterMode.IN);
		//set values to IN params
		query.setParameter(1, start);
		query.setParameter(2, end);
		//call the PL/SQL procedure
		List<Doctor>  list=query.getResultList();
		return list;
	}

}
