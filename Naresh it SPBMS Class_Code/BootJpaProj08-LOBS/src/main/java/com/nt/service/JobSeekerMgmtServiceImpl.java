package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private IJobSeekerRepository  jobRepo;

	@Override
	public String registerJobSeeker(JobSeeker js) {
		int idVal=jobRepo.save(js).getJsid();
		return "JobSeeker is saved with the id  Value:"+idVal;
	}

	@Override
	public JobSeeker showJobSeekerById(int id) {
		return jobRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
	}

}
