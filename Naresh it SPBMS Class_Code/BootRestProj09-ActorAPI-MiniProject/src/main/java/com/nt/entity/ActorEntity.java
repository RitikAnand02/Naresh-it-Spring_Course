//ActorEntity.java
package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
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

@Data
@Entity
@Table(name="REST_ACTOR_API")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class ActorEntity {
	
	//Data properites
	@Id
	@SequenceGenerator(name="gen1",sequenceName ="AID_SEQ",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer aid;
	@NonNull
	@Column(length = 30)
	private  String aname;
	
	@NonNull
	@Column(length = 30)
	private   String  category;
	
	@NonNull
	@Column(length = 30)
	private  String  addrs;
	@NonNull
	private   Double  remunaration;

	 //MetaData properties
	@Version
	private   Integer  updateCount;
	@CreationTimestamp
	@Column(updatable = false)
	private   LocalDateTime  createdOn;
	@UpdateTimestamp
	@Column(insertable = false)
	private   LocalDateTime  updatedOn;
	@Column(length = 30)
	private   String active_SW="active";
	@Column(length = 30,updatable = false)
	private   String  createdBy;
	@Column(length = 30,insertable = false)
	private  String  updatedBy;
	
}
