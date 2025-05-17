package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor,Integer> {
	
	/*public  List<Doctor>  findByDnameEquals(String name);
	public  List<Doctor>  readByDnameIs(String name);
	public  List<Doctor>  getByDname(String name);*/
	public   List<Doctor>  findByFeeBetween(double start,double end);
	public  List<Doctor>   findByAddrsStartingWith(String initChars);
	public  List<Doctor>   findByAddrsEndingWith(String lastChars);
	public  List<Doctor>   findByAddrsContaining(String chars);
	public  List<Doctor>   findByFeeGreaterThanEqualAndFeeLessThanEqualOrderByExpertAsc(double start,double end);
	public  List<Doctor>   findByExpertInOrFeeBetween(List<String> expertee, double start, double end );
	public    Doctor     findByDnameEquals(String name);
	public  Optional<Doctor>  readByDnameEquals(String name);
	
	
	

}
