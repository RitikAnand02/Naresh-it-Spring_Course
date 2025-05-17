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
	
	
	/*CREATE DEFINER=`root`@`localhost` PROCEDURE `P_AUTHENTICATION`(IN uname varchar(20), IN pwd varchar(20),out result  varchar(10))
			BEGIN
			   declare cnt int(2);
			   select count(*) into cnt  from users_info where username=uname and password=pwd; 
			   if(cnt<>0) then
			     set result="InValid Credentials";
				else
			    set result="Valid Credentials";
			    end if;
			END
	*/
	@Override
	public String login(String user, String pwd) {
		//create Query object pointing PL/SQL procedure
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("P_AUTHENTICATION",String.class);
		//regsiter parameters
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		//set values to Query params
		query.setParameter(1, user);
		query.setParameter(2, pwd);
		//call  PL/SQL Procedure
		String msg=(String) query.getOutputParameterValue(3);
		return msg;
		}
	
	
	
	
}
