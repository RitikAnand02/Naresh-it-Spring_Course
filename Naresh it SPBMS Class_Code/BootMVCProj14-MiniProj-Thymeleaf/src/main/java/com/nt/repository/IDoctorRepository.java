package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.DoctorEntity;

public interface IDoctorRepository extends JpaRepository<DoctorEntity, Integer> {

}
