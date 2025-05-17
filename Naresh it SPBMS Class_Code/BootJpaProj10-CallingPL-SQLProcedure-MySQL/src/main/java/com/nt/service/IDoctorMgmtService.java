package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService {
    public  List<Doctor>  showDoctorsByFeeRange(double start,double end);
}
