//ActorVO.java
package com.nt.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorVO{
	
	//Data properites
	private Integer aid;
	private  String aname;
	private   String  category;
	private  String  addrs;
	private   Double  remunaration;
	
}
