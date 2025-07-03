//ActorOperationsRestController.java
package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.IActorMgmtService;
import com.nt.vo.ActorVO;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationsRestController {
	@Autowired
	private IActorMgmtService  actorService;
	
	/*@PostMapping("/save")
	public ResponseEntity<String>  saveActor(@RequestBody ActorVO vo){
		try {
	//use  service
		String msg=actorService.registerActor(vo);
		return  new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		catch(Exception e) {
			return  new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}//method
	*/
	
	@PostMapping("/save")
	public ResponseEntity<String>  saveActor(@RequestBody ActorVO vo){
	//use  service
		String msg=actorService.registerActor(vo);
		return  new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public  ResponseEntity<List<ActorVO>>  showAllActors(){
		//use service
		List<ActorVO> listVO=actorService.showAllActors();
		return new ResponseEntity<List<ActorVO>>(listVO,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public    ResponseEntity<ActorVO>  showActorById(@PathVariable int id){
		//use service
		ActorVO  vo=actorService.showActorById(id);
		return   new ResponseEntity<ActorVO>(vo,HttpStatus.OK);
	}
	
	@GetMapping("/find/{start}/{end}")
	public    ResponseEntity<List<ActorVO>>  showActorsRemunaration(@PathVariable double start,
			                                                                                                                            @PathVariable double end){
		//use service
		List<ActorVO>  list=actorService.showActorsByRemunaration(start, end);
		return  new ResponseEntity<List<ActorVO>>(list,HttpStatus.OK);
	}
	
	@PatchMapping("/update/{aid}/{percent}")
	public    ResponseEntity<String>  showActorsRemunaration(@PathVariable int aid,
			                                                                                                                      @PathVariable double percent){
		//use service
		String msg=actorService.updateActorRemunaration(aid, percent);
		//return  ResposeEntity object
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public    ResponseEntity<String>  updateActorData(@RequestBody ActorVO vo){
		//use service
		String msg=actorService.updateActor(vo);
		//return  ResposeEntity object
	   return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public    ResponseEntity<String>  deleteActor(@PathVariable int id){
		//use service
		String msg=actorService.removeByActorById(id);
		//return  ResposeEntity object
		   return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{cat1}/{cat2}/{cat3}")
	public    ResponseEntity<String>  deleteActor(@PathVariable String cat1,
			                                                                             @PathVariable String cat2,
			                                                                             @PathVariable String cat3){
		//use service
		String msg=actorService.removeByActorsCategory(cat1, cat2, cat3);
		//return  ResposeEntity object
		   return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
		
}//class
