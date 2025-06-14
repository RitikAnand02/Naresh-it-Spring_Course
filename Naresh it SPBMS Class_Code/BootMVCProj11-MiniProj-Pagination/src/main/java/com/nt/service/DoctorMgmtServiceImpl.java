package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.entity.DoctorEntity;
import com.nt.repository.IDoctorRepository;
import com.nt.vo.DoctorVO;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private  IDoctorRepository doctorRepo;

	@Override
	public List<DoctorVO> showDoctors() {
		//use repo
		List<DoctorEntity> listEntities=doctorRepo.findAll();
		//copy listEntities to listVO
		List<DoctorVO>  listVO=new ArrayList();
		listEntities.forEach(entity->{
			DoctorVO vo=new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		listVO.sort((vo1,vo2)->vo1.getDname().compareToIgnoreCase(vo2.getDname()));
		return listVO;
	}
	
	@Override
	public String regsisterDoctor(DoctorVO vo) {
		//convert VO  object to Entity Object
		DoctorEntity  entity=new DoctorEntity();
		BeanUtils.copyProperties(vo, entity);
		//use repo
		int idVal=doctorRepo.save(entity).getDid();
		return "Doctor is registered with the id value::"+idVal;
	}
	
	@Override
	public DoctorVO showDoctorById(int id) {
		 //Load the object
		DoctorEntity  doctorEntity=doctorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
		 //convert Entity object to  VO object
		DoctorVO  doctorVO=new DoctorVO();
		BeanUtils.copyProperties(doctorEntity, doctorVO);
		return doctorVO;
	}
	
	@Override
	public String updateDoctor(DoctorVO vo) {
		//convert VO  object to Entity Object
		DoctorEntity  entity=doctorRepo.findById(vo.getDid()).orElseThrow(()->new IllegalArgumentException("invalid id"));
		BeanUtils.copyProperties(vo, entity);
		//use repo
		int idVal=doctorRepo.save(entity).getDid();
		return "Doctor with  id value123::"+idVal+" is  updated";
	}

	@Override
	public String removeDoctorById(int did) {
	    //Load  Doctor object
		DoctorEntity doctorEntity=doctorRepo.findById(did).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
		doctorRepo.deleteById(did);
		return did+" Doctor is removed";
	}

	@Override
	public Page<DoctorVO> showDoctors(Pageable pageable) {
		  //get records count
		long count=doctorRepo.count();
		  
		 //use repo
		  Page<DoctorEntity>  pageEntities=doctorRepo.findAll(pageable);
		  List<DoctorEntity>  listEntities=pageEntities.getContent();
		  List<DoctorVO>  listVO=new ArrayList();
		  listEntities.forEach(entity->{
			  DoctorVO  vo=new DoctorVO();
			  BeanUtils.copyProperties(entity, vo);
			  listVO.add(vo);
		  });
		  Page<DoctorVO>  pageVO=new PageImpl<DoctorVO>(listVO,pageable,count);
			return pageVO;
	}


}
