//IActorMgmtService.java
package com.nt.service;

import java.util.List;

import com.nt.vo.ActorVO;

public interface IActorMgmtService {
    public  ActorVO  registerActor(ActorVO vo);
    public  List<ActorVO>  showAllActors();
    public   ActorVO   showActorById(int id);
    public  List<ActorVO>  showActorsByRemunaration(double start,double end);
    public   String    updateActorRemunaration(int aid , double  percent);
    public   ActorVO     updateActor(ActorVO  vo);
    public   String     removeByActorById(int  id);
    public   String     removeByActorsCategory(String cat1,String cat2,String cat3);
    
}
