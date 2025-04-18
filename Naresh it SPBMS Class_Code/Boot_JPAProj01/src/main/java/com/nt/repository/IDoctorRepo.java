package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Doctor;

public interface IDoctorRepo extends CrudRepository<Doctor, Integer> {

}
