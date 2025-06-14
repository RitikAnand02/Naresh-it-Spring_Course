package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.vo.DoctorVO;

public interface IDoctorMgmtService {
   public   List<DoctorVO>   showDoctors();
   public   String    regsisterDoctor(DoctorVO  vo);
   public    DoctorVO   showDoctorById(int id);
   public  String  updateDoctor(DoctorVO  vo);
   public  String  removeDoctorById(int did);
   
   public   Page<DoctorVO>   showDoctors(Pageable pageable);
   
}
