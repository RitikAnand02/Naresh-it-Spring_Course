//DoctorEntity.java
package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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
@SQLDelete(sql="UPDATE  JPA_DOCTOR_VER_TS  SET ACTIVE_SW='inactive'  WHERE DOCTOR_ID=?  AND UPDATE_COUNT=?")
@SQLRestriction("ACTIVE_SW <> 'inactive' ")

public  class DoctorEntity {
	@Column(name="DOCTOR_ID")
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "DID_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy =GenerationType.SEQUENCE)  //generated id values  like 1,2,52 and etc..
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
	private  String  active_SW="active";
	
	
}
