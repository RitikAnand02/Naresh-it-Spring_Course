package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.PersonalInfo;

public class ValueAnnotionTest {

	public static void main(String[] args) {
		//create the IOC container
		ClassPathXmlApplicationContext  ctx=
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Spring Bean class obj ref
		PersonalInfo  info=ctx.getBean("pInfo",PersonalInfo.class);
		System.out.println(info);
		
		//get Environment object from IOC container
		 Environment env=ctx.getEnvironment();
		 System.out.println("os name::"+env.getProperty("os.name"));
		//close the container
		 ctx.close();

	}

}
