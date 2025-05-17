package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Politiician;
import com.nt.repository.IPoliticianRepository;
@Service("politicianService")
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private IPoliticianRepository  politicianRepo;

	@Override
	public String registerPolitician(Politiician politician) {
		//use repo
		int idVal=politicianRepo.save(politician).getPid();
		return "Politiican is saved with the id value::"+idVal;
	}

	@Override
	public Iterable<Politiician> showAllPoliticians() {
		return politicianRepo.findAll();
	}
	
	@Override
	public float showPoliticialAgeById(int id) {
		//use repo
		return politicianRepo.calculatePoliticianAgeById(id);
	}

}
