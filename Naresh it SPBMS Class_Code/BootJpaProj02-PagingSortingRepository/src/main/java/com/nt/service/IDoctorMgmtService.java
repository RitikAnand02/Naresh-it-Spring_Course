package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService {

	public   Iterable<Doctor>   showDoctorsAsSorted(boolean ascOrder,String ... props);
	public   Page<Doctor>  showDoctorDataByPageNo(int pageNo,int pageSize);
	public  Page<Doctor>  showDoctorsByPageNoSorted(int pageNo,int pageSize,boolean ascOrder,String ...props);
	public   void     showDoctorsByPagination(int pageSize);
	
}
