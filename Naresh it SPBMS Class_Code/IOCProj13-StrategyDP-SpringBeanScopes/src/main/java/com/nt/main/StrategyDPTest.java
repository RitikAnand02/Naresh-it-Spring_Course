package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class StrategyDPTest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=
				          new AnnotationConfigApplicationContext(AppConfig.class);
		/*		//get access to Target spring bean class obj ref
				Vehicle  vehicle=ctx.getBean("vehicle",Vehicle.class);
				Vehicle  vehicle1=ctx.getBean("vehicle",Vehicle.class);
				Vehicle  vehicle2=ctx.getBean("vehicle",Vehicle.class);
				System.out.println(vehicle.hashCode()+"  "+vehicle1.hashCode()+" "+vehicle2.hashCode());
				
				//invoke the b.method
		   vehicle.journey("hyd", "tiripathi");
		 //close the IOC container
		   ctx.close();
		*/	
		}
}
