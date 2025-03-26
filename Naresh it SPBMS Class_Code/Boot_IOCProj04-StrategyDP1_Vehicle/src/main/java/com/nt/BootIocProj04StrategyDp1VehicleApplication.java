package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootIocProj04StrategyDp1VehicleApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(BootIocProj04StrategyDp1VehicleApplication.class, args);
	
	Vehicle vehicle= ctx.getBean("vehicle",Vehicle.class);
	
    vehicle.journey("Bihar","Noida");
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
