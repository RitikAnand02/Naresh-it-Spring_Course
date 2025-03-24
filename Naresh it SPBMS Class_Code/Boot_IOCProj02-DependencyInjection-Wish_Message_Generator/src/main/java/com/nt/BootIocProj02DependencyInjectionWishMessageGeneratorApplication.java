package com.nt;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessage;

@SpringBootApplication
public class BootIocProj02DependencyInjectionWishMessageGeneratorApplication {
	 @Bean(name = "lt")
	   public LocalTime createTime() {
			return LocalTime.now();
	   }

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(BootIocProj02DependencyInjectionWishMessageGeneratorApplication.class, args);
	
	System.out.println("Class Name ::"+ctx.getClass());
	
	WishMessage msg = ctx.getBean("wm",WishMessage.class);
	
	String name = msg.showWishMessage("Ritik");
	System.out.println("Result is ::"+name);
	
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
