//IFacultyRepository.java
package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Faculty;

public interface IFacultyRepository extends JpaRepository<Faculty, Integer> {

}
