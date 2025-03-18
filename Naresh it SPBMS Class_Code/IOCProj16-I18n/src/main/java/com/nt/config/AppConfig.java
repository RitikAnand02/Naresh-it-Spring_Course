//AppConfig.java
package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name="messageSource")  //fixed bean id here becoz ctx.getMessage(-) interally calls ctx.getBean("messageSource") method internally
	public   ResourceBundleMessageSource   createRBMS() {
		 ResourceBundleMessageSource  messageSource=new ResourceBundleMessageSource();
		  messageSource.setBasename("com/nt/commons/App");  //base properties  file configuration
		  return  messageSource;
	}
	

}
