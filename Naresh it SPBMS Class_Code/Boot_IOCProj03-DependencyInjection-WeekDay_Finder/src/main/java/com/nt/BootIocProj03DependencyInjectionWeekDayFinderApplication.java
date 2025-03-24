package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WeekDayFinder;

@SpringBootApplication
public class BootIocProj03DependencyInjectionWeekDayFinderApplication {
	@Bean(name="Idate")
	public LocalDate createLDate() {
	System.out.println("AppConfig.createLDate()");
	return LocalDate.now();
	}

	public static void main(String[] args) {
	ApplicationContext ctx  =SpringApplication.run(BootIocProj03DependencyInjectionWeekDayFinderApplication.class, args);
	 
	//get target Spring bean class obj ref 
	Object obj=ctx.getBean("wdf");
	//type casting
	WeekDayFinder finder=(WeekDayFinder)obj; 
	//invoke the b.methods
	String msg=finder.showMessage("Ritik");
	System.out.println("Result is::"+msg);
	
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
