//Doctor.java
package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_DOCTOR")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public  class Doctor {
	@Column(name="DOCTOR_ID")
	@Id
	private  Integer did;
	@Column(name="DOCTOR_NAME",length = 20)
	@NonNull
   private  String   dname;
	@Column(name="DOCTOR_ADDRS",length = 20)
	@NonNull
	private  String  addrs;
	@Column(name="DOCTOR_EXPERT",length = 20)
	@NonNull
   private  String  expert;
	@Column(name="DOCTOR_FEE")
	@NonNull
	//@Transient
   private  Double fee;
}
