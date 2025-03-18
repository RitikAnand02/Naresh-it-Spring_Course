package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class EmployeeInfo {
	//  injecting  properites file values to  spring bean properties
	@Value("${per.id}")
	private Integer id;
	@Value("${per.name}")
	private String  name;
	@Value("${per.addrs}")
	private  String  addrs;
	@Value("${per.age}")
	private  Integer  age;
	// Injecting  direct values to  spring bean property
	@Value("natarazjavaarena@gmail.com")
	private  String mail;
	//system properties 
	@Value("${os.name}")
	private  String  osName;
	@Value("${os.version}")
	private  String  osVer;
	//Injecting env..variable value
	@Value("${Path}")
	private String  pathData;
	
	//toString()  (alt+shift+s,s)
	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", addrs=" + addrs + ", age=" + age + ", mail=" + mail
				+ ", osName=" + osName + ", osVer=" + osVer + ", pathData=" + pathData + "]";
	}
	

}
