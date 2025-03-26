package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj04StrategyDp1VehicleApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(BootIocProj04StrategyDp1VehicleApplication.class, args);
	
	Vehicle vehicle= ctx.getBean("vehicle",Vehicle.class);
	
    vehicle.journey("Bihar","Noida");
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
