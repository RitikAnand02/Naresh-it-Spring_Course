package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("com/nt/config/applicationContext.xml") 
public class BootIocProj15MiniProjectDatabaseApplication {

	public static void main(String[] args) {
		   SpringApplication.run(BootIocProj15MiniProjectDatabaseApplication.class, args);			
		 
	  }
	
}	
	
