package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootIocProj11YmlApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(BootIocProj11YmlApplication.class, args);
	
	Employee emp1 = ctx.getBean("emp",Employee.class);
	
	System.out.println("Employee Data ::"+ emp1);
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
