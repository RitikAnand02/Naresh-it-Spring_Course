package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		
		String msg =fpkt.shopping(new String[]{"Jeans","Shirt","Shoes"},new double[]{2000.0,1000.0,500.0});
		
		System.out.println(msg);
		
		ctx.close();

	}

}
