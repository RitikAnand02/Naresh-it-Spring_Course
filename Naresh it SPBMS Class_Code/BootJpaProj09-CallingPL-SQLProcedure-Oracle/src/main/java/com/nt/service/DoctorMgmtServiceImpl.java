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
	
	/*CREATE OR REPLACE PROCEDURE P_GET_DOCTORS_BY_FEE 
	(
	  STARTFEE IN NUMBER 
	, ENDFEE IN NUMBER 
	, DETAILS OUT SYS_REFCURSOR 
	) AS 
	BEGIN
	  
	  open details for
	    SELECT  *    FROM  JPA_DOCTOR WHERE DOCTOR_FEE>=STARTFEE AND DOCTOR_FEE<=ENDFEE;
	    
	  
	  
	END P_GET_DOCTORS_BY_FEE;*/

	@Override
	public List<Doctor> showDoctorsByFeeRange(double start, double end) {
		// create StoreProcedure  object pointing to PL/SQL Procedure
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_FEE",Doctor.class);
		//register both IN ,OUT params
		query.registerStoredProcedureParameter(1, Integer.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Integer.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(3,Object.class, ParameterMode.REF_CURSOR);
		//set values to IN params
		query.setParameter(1, start);
		query.setParameter(2, end);
		//call the PL/SQL procedure
		List<Doctor>  list=query.getResultList();
		return list;
	}

}
