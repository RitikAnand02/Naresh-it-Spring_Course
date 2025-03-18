//PersonalInfo.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
 //@PropertySource("com/nt/commons/myfile.properties")
public class PersonalInfo {
	  //Injecting values collected from the properties file
	@Value("${per.name}")
	private String name;
	@Value("${per.addrs}")
	private String addrs;
	@Value("${per.age}")
	private Integer age;
	
	//Injecting the direct values
	@Value("5000036")
	private  Long pinCode;
	
	//Injecting the system property values
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private  String osVersion;
	
	//Injecting env.. variable values
	@Value("${Path}")
	private  String pathData;

	
	
	
	//toString()
	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", addrs=" + addrs + ", age=" + age + ", pinCode=" + pinCode + ", osName="
				+ osName + ", osVersion=" + osVersion + ", pathData=" + pathData + "]";
	}
	
	
	

}//class
