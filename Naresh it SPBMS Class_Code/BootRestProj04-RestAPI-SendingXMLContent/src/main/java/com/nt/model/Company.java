package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class  Company {
	private  Integer cid;
	private  String  name;
	private  String  location;
	private  Integer size;
	private   Long pinCode;

}
