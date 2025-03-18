package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.EmployeeInfo;
import com.nt.sbeans.EmployeeInfo1;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=
				        new  AnnotationConfigApplicationContext(AppConfig.class);
		//get  Spring Bean class obj ref
		EmployeeInfo  info=ctx.getBean("emp",EmployeeInfo.class);
		System.out.println("Employee object data ::"+info);
		
		System.out.println("===========================");
		  //get Access to Environment object
		Environment  env=ctx.getEnvironment();
		System.out.println("per.name key value ::"+env.getProperty("per.name"));
		System.out.println("os.name  key value ::"+env.getProperty("os.name"));
		
		System.out.println("=======================");
		EmployeeInfo1  info1=ctx.getBean("emp1",EmployeeInfo1.class);
		info1.displayData();
		
		System.out.println("===================");
		System.out.println("Environment object class name::"+env.getClass());
		
		//close the container
		ctx.close();

	}

}
