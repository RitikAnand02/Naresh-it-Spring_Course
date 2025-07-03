//IActorRepository.java
package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.ActorEntity;

import jakarta.transaction.Transactional;

public interface IActorRepository extends JpaRepository<ActorEntity, Integer> {
      @Query("from ActorEntity  where remunaration>=:start and remunaration<=:end order by aname asc")
	  public   List<ActorEntity>  showActorsByRemuneration(double start,double end);
      
      @Query("delete from ActorEntity  where category in(:cat1,:cat2,:cat3)")
      @Modifying
      @Transactional
 	  public  int  deleteActorsByCategory(String cat1,String cat2,String cat3);
}
