package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class StrategyDPTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Vehicle vehicle= ctx.getBean("vehicle",Vehicle.class);
		
	    vehicle.journey("Bihar","Noida");
		
		ctx.close();

	}

}
