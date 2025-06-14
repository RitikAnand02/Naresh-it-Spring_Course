package com.nt.service;

import java.util.List;

import com.nt.vo.DoctorVO;

public interface IDoctorMgmtService {
   public   List<DoctorVO>   showDoctors();
   public   String    regsisterDoctor(DoctorVO  vo);
   public    DoctorVO   showDoctorById(int id);
   public  String  updateDoctor(DoctorVO  vo);
   public  String  removeDoctorById(int did);
}
