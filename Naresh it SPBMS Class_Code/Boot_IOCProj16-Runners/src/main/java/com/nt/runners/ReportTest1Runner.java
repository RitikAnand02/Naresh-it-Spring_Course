package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
//@Order(15)
public class ReportTest1Runner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ReportTest1Runner.run()  (CommandLine Runner)");
		System.out.println("Command line args are :::"+Arrays.toString(args));
		System.out.println("-------------------------------------------");
		
	}
	
	@Override
	public int getOrder() {
		return 1;
	}

}
