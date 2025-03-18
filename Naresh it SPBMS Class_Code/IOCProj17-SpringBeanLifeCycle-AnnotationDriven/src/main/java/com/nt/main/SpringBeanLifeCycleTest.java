package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.VoterCheckingElgibility;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		//create the IOC container
		AnnotationConfigApplicationContext  ctx=
				        new  AnnotationConfigApplicationContext(AppConfig.class);
		//get  spring bean class obj ref
		VoterCheckingElgibility  elgibility=ctx.getBean("vce",VoterCheckingElgibility.class);
		
		try {
		//invoke the b.method
		String msg=elgibility.checkVotingElgibility();
		System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close  IOC container
		ctx.close();
	}
}
