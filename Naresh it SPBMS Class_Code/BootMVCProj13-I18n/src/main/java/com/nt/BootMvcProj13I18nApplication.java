package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj13I18nApplication {
	
	
	@Bean(name="localeResolver")//fixed Bean id
	public  SessionLocaleResolver  createResolver() {
		System.out.println("BootMvcProj13I18nApplication.createResolver()");
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		//resolver.setDefaultLocale(Locale.of("en","US"));
		resolver.setDefaultLocale(new Locale("en","US"));
		return resolver;
	}
	
	@Bean(name="lci")
	public  LocaleChangeInterceptor  createLCI() {
		System.out.println("BootMvcProj13I18nApplication.createLCI()");
		LocaleChangeInterceptor  interceptor=new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj13I18nApplication.class, args);
	}

}
