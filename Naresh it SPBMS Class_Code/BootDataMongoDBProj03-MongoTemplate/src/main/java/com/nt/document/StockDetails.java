//StockDetails.java
package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class StockDetails {
	@Id
	private String id;
	private  String name;
	private   Double  price;
	private  String exchange;


}
