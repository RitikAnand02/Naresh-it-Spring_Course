package com.nt.model;

import io.micrometer.common.lang.NonNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data

@RequiredArgsConstructor
public class Employee{
	@NonNull
   private Integer empno;
	@NonNull
   private String ename;
	@NonNull
   private String desg;
	@NonNull
   private Double salary;
   private Integer deptno;
   private Double grossSalary;
   private Double netSalary;
   
}
