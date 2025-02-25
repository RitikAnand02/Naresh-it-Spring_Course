package com.nt.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import
org.springframework.context.annotation.Configuration;
@Configuration // @Component++
@ComponentScan (basePackages = "com.nt.sbeans")


public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig:: O-param constructor");
	}
	//pre-defined class as the spring bean
	@Bean(name="Idate")
	public LocalDate createLDate() {
	System.out.println("AppConfig.createLDate()");
	return LocalDate.now();
	}

}
