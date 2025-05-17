package com.nt.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Doctor;

import jakarta.transaction.Transactional;

public interface IDoctorRepository extends JpaRepository<Doctor,Integer> {
	
	  @Query("from Doctor  where expert  in(?1,?2,?3) order by expert")
	 //@Query("from Doctor  where expert in(?,?,?) order by expert") --> JDBC style positional params are not allowed
  	//@Query("from Doctor  where expert in(:sp1,:sp2,:sp3) order by expert") 
    public List<Doctor>   showDocotorsBySpecializations(String sp1,String sp2, String sp3);
    //  public List<Doctor>   showDocotorsBySpecializations(@Param("sp1")String speciality1,@Param("sp2")String speciality2,@Param("sp3") String speciality3);
	
	  
	  // Bulk Select Query  as the Entity Query (all col values)
	  @Query("from  Doctor  where addrs=:city  and expert=:sp")
	  public List<Doctor>  showDoctorsByAddrsAndSpeicialization(String city,String sp);
	  
	  //bulk scalar query  selecting specific mulitple col values
	  @Query("select dname,fee,expert from  Doctor  where  fee>=:start and fee<:end")
	  public  List<Object[]> showDoctorsDataByFeeRange(double start,double end);
	  
	//bulk scalar query  selecting specific single col values
	  @Query("select dname from  Doctor  where  dname like :chars")
	  public  List<String>  showDoctorsNameByNameChars(String chars);
	  
	  //  Select Entity Query giving single row
	  @Query("from Doctor  where dname=:name")
	  public  Optional<Doctor>   showDoctorByName(String  name);
	  //select Scalar Query  giving single row multiple col values
	  @Query(" select dname,expert,fee  from Doctor  where dname=:name")
	  public   Object   showDoctorDataByName(String name);

	  //select Scalar Query  giving single col  value
	  @Query(" select fee  from Doctor  where dname=:name")
	  public   Double  showDoctorFeeByName(String name);
	  
	  
	  //select query  with single aggregate function
	  @Query("select  count(distinct addrs)  from Doctor")
	  public    int   showUniqueDoctorsAddrsCount();
	  
	//select query  with  mutiple  aggregate functions
	  @Query("select  count(*),sum(fee), avg(fee),min(fee),max(fee)  from Doctor")
	  public  Object   showDoctorsAggregateData();
	  

	  @Query("update Doctor set fee=fee+ (fee* :hikePercent/100.0) where expert=:speciality")
	  @Modifying
	  @Transactional
	  public   int   modifyDoctorFeeBySpecialization(double hikePercent, String speciality);
	  
	  @Query("delete from Doctor  where addrs in(:addrs1,:addrs2,:addrs3)")
	  @Modifying
	  @Transactional
	  public  int    removeDoctorsByAddresses(String addrs1,String addrs2,String addrs3);
	  
	  
	  @Query(nativeQuery = true, value="select now() from Dual")
	  public   LocalDateTime    showSysDateTime();
	 	  
}
