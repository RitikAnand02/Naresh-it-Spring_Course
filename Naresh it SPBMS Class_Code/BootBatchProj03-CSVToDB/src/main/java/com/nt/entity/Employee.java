package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="BATCH_EMPLOYEE")
@Data
public class Employee {
	@Id
	private Integer eno;
	@Column(length = 30)
	private  String ename;
	@Column(length = 40)
	private  String  eadd;
	@Column(length = 60)
	private  String email;
	private  Double salary;
	private  Double grossSalary;
	private Double netSalary;

}
