package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.nt.ston.Printer;

@Configuration
//@ComponentScan(basePackages = {"com.nt.sbeans","com.nt.ston"})
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
	
	//@Bean(name="prn1")
	@Bean
	@Scope("singleton")
	@Lazy(true)
	public   Printer  createPrinter1() {
		return  Printer.getInstance();  //static factory method based bean instantiation
	}
	
	//@Bean(name="prn2")
	@Bean
	@Scope("singleton")
	@Lazy(true)
	public  Printer  createPrinter2() {
		return  Printer.getInstance();  // //static factory method based bean instantiation
	}
	
}
