package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01DependencyInjectionSeasonFinderApplication {

    @Bean(name = "ld")
   public LocalDate createDate() {
		return LocalDate.now();
   }

	public static void main(String[] args) {
	ApplicationContext ctx =SpringApplication.run(BootIocProj01DependencyInjectionSeasonFinderApplication.class, args);
	System.out.println("Class Name ::"+ctx.getClass());
	
	SeasonFinder finder = ctx.getBean("sf",SeasonFinder.class);
	
	//invoke the b.method
	String name = finder.findSeason();
	System.out.println("Season Name ::"+name);
	
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
