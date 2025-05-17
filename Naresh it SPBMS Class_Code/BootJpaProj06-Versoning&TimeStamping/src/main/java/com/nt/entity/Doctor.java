//Doctor.java
package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_DOCTOR_VER_TS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public  class Doctor {
	@Column(name="DOCTOR_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  //generated id values  like 1,2,52 and etc..
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
	
	//MetaData   properites
	@Version
	private  Integer  updateCount;
	@CreationTimestamp
	@Column(updatable = false,insertable = true)
	private   LocalDateTime  registeredOn;
	@UpdateTimestamp
	@Column(insertable = false,updatable = true)
	private  LocalDateTime   lastlyUpdatedOn;
	@Column(length = 30)
	private  String  createdBy;
	@Column(length = 30)
	private  String updatedBy;
	@Column(length = 10)
	private  String  active_SW;
	
	
}
