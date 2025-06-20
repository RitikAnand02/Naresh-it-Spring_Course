package com.nt.model;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data 
//@NoArgsConstructor
@AllArgsConstructor 
@RequiredArgsConstructor
public class Customer {
	
	@NonNull
	private Integer cno; 
	@NonNull
	private String cname; 
	@NonNull
	private String cadd;
	@NonNull
	private Float billAmt; 
	
//	private String[] favColors; 
//	private List<String> studies; 
//	private Set<Long> phoeNumbers; 
//	private Map<String, Object> idDetails; //HAS-A property 
//	private Company company; 
} 
