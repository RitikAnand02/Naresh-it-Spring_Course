package com.nt.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class ReportTest2Runner implements ApplicationRunner,Ordered {

    
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ReportTest2Runner.run() (ApplicationRunner)");
		 System.out.println("Non-Option Arg  alues ::"+args.getNonOptionArgs());
		 
		 System.out.println("Option Arg names and values are ::");
		  Set<String>  optArgNames=args.getOptionNames();
		  optArgNames.forEach(name->{
			  System.out.println(name+" .... "+args.getOptionValues(name));
		  });
		System.out.println("-------------------------------------");
	}
	
	@Override
	public int getOrder() {
		return -1;
	}

	

}
