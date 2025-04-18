package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JPA_Doctor")
@Data
public class Doctor {
	@Column(name="DOC_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer did;
	@Column(name="DOC_NAME",length = 30)
	private String dname;
	@Column(name="DOC_SPECIALIZATION",length = 30)
	private String specialization;
	@Column(name="DOC_INCOME")
	private Double income;
}
