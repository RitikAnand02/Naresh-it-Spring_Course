package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=
				             new  AnnotationConfigApplicationContext(AppConfig.class);
	//get Target Spring bean class obj ref
		Flipkart  fpkt=ctx.getBean("fpkt",Flipkart.class);
		
		
		//invoke the b.method
		try {
			String resultMsg=fpkt.shopping(new String[] {"shirt","color-gun","sweets"}, 
					                                                 new double[] {3000.0,600.0,1000.0});
			System.out.println(resultMsg);
			
			}
		catch(Exception e) {
			e.printStackTrace();
		} 
		
		
	}

}
