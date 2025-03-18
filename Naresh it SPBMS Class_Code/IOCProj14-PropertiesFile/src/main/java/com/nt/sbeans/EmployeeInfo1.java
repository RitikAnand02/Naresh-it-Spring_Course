package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("emp1")
public class EmployeeInfo1 {
	@Autowired
	private Environment  env;
	
	public    void  displayData() {
		System.out.println("per.name  key value ::"+env.getProperty("per.name"));
		System.out.println("os.name key value ::"+env.getProperty("os.name"));
	}

}
