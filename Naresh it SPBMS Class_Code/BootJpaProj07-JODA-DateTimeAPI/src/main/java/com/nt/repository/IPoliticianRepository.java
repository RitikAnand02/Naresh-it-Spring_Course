package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Politiician;

public interface IPoliticianRepository extends JpaRepository<Politiician, Integer> {
//@Query(value="select (sysdate-dob)/365.25 from JODA_POLITICIAN where pid=:id",nativeQuery=true)  //for oracle
	
	@Query(value="select (TimestampDiff(DAY,dob,curdate()))/365.25 from JODA_POLITICIAN where pid=:id",nativeQuery=true)  //for mysql
	public   Float     calculatePoliticianAgeById(int id);
}
