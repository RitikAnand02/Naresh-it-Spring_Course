//Faculty.java (Child class)
package com.nt.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="MTM_FACULTY_TAB")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Faculty {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "FID_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
   private Integer  fid;
	@Column(length = 30)
	@NonNull
   private  String  fname;
	
	@Column(length = 30)
	@NonNull
   private  String subject;
	@Column(length = 30)
	@NonNull
   private  String qlfy;
	@ManyToMany(targetEntity = Student.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "faculties")
   private Set<Student>  students=new HashSet<Student>();
	
	// 0-param constructor
	public  Faculty() {
		System.out.println("Faculty:: 0-param constructor");
	}

	
	//toString() (alt+shift+s,s)
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", subject=" + subject + ", qlfy=" + qlfy + "]";
	}
	
  
   
}
