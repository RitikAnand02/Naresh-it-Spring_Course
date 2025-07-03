//ActorVO.java
package com.nt.vo;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorVO implements Serializable{
	
	//Data properites
	private Integer aid;
	private  String aname;
	private   String  category;
	private  String  addrs;
	private   Double  remunaration;
	
}
