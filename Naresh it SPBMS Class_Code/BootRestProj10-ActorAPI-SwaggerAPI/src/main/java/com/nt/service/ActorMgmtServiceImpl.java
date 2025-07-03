//ActorMgmtServiceImpl.java
package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.ActorEntity;
import com.nt.exceptions.ActorNotFoundException;
import com.nt.repository.IActorRepository;
import com.nt.vo.ActorVO;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private   IActorRepository  actorRepo;

	@Override
	public String registerActor(ActorVO vo) {
		//covert  VO class obj  to entity class obj
		ActorEntity entity=new ActorEntity();
		BeanUtils.copyProperties(vo, entity);
		entity.setCreatedBy(System.getProperty("user.name"));
		//save the object
		int idVal=actorRepo.save(entity).getAid();
		return "Actor obj is saved with the id value ::"+idVal;
	}
	
	@Override
	public List<ActorVO> showAllActors() {
		//use repo
		List<ActorEntity>  listEntities=actorRepo.findAll();
		//copy listEntities to listVO
		List<ActorVO>  listVO=new ArrayList();
		listEntities.forEach(entity->{
			ActorVO vo=new ActorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}
	
	@Override
	public ActorVO showActorById(int id) {
		//use repo
		ActorEntity entity=actorRepo.findById(id).orElseThrow(()->new ActorNotFoundException("invalid id"));
		//convert  entity  to vo
		ActorVO  vo=new ActorVO();
		BeanUtils.copyProperties(entity, vo);
		return  vo;
	}
	
	@Override
	public List<ActorVO> showActorsByRemunaration(double start, double end) {
		//use repo
		List<ActorEntity>  listEntities=actorRepo.showActorsByRemuneration(start, end);
		//copy listEntities to listVO
		List<ActorVO>  listVO=new ArrayList<>();
		listEntities.forEach(entity->{
			ActorVO vo=new ActorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}
	
	@Override
	public String updateActorRemunaration(int aid, double percent) {
		//use repo
		ActorEntity entity=actorRepo.findById(aid).orElseThrow(()->new ActorNotFoundException("invalid id"));
		//update the remunration
		entity.setRemunaration(entity.getRemunaration()+(entity.getRemunaration()*percent/100.0));
	    //save the object
		actorRepo.save(entity);
		return aid+" Actor  Remunation is  updated";
	}
	
	@Override
	public String updateActor(ActorVO vo) {
		//use repo
		ActorEntity entity=actorRepo.findById(vo.getAid()).orElseThrow(()->new ActorNotFoundException("invalid id"));
		//copy  vo  obj  data to entity object
		BeanUtils.copyProperties(vo, entity);
		entity.setUpdatedBy(System.getProperty("user.name"));
		//update the object
		actorRepo.save(entity);
		return vo.getAid()+"Actor is updated";
	}
	
	@Override
	public String removeByActorById(int id) {
		//use repo
		ActorEntity entity=actorRepo.findById(id).orElseThrow(()->new ActorNotFoundException("invalid id"));
		//remove Actor
		actorRepo.deleteById(id);
		return id+" Actor is Deleted";
	}
	
	@Override
	public String removeByActorsCategory(String cat1, String cat2, String cat3) {
		//use repo
		int count=actorRepo.deleteActorsByCategory(cat1, cat2, cat3);
		return count==0?"Actors not found":count+" no.of actors are deleted";
	}

}
