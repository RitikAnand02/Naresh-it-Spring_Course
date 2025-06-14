package com.nt.configurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.nt.interceptors.TimeCheckInterceptor;

@Component
public class MyWebAppConfigurer implements WebMvcConfigurer {
	@Autowired
	private  TimeCheckInterceptor  tci;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(tci);
	}

}
