package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		//working with InMemory DB  as  Authentication Info provider
	/*	auth.inMemoryAuthentication().withUser("raja").password("{noop}rani").roles("CUSTOMER").disabled(true);
		auth.inMemoryAuthentication().withUser("rajesh").password("{noop}hyd").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("suresh").password("{noop}delhi").roles("MANAGER","CUSTOMER");
		auth.inMemoryAuthentication().withUser("nagesh").password("{noop}vizag").roles("VISITOR");*/
		
		
		
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("raja")
		 .password("$2a$10$e8lP5MRUEtBiqmaCpTWDSuS7mMCBKYZdjtvs2haIiYdTxAamjBI1W").roles("CUSTOMER");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("rajesh")
		.password("$2a$10$ASev8rFS.khOSeCL/w2Iu.fJQvdtuTk7/aymr8kKToeP/0g.B8ZeG").roles("MANAGER");
		
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("suresh")
		.password("$2a$10$A8bip.eC5EzJLAPsG4I/wedw/QKYfSUV2pEpMWtn6svbtmxVGB8Y2").roles("MANAGER","CUSTOMER");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("nagesh")
		.password("$2a$10$6YOgav1EIkqe6y1Igbv6/eO0sucqFo70qDHZU.Dylh/IANoMt0ND.").roles("VISITOR");

	}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		 //Authentication + Authorization confiugrations
		http.authorizeHttpRequests().antMatchers("/").permitAll()
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyRole("CUSTOMER","MANAGER")
		.antMatchers("/loan").hasRole("MANAGER")
		.and().formLogin()
		.and().logout()
		//.and().httpBasic()
		.and().exceptionHandling().accessDeniedPage("/denied")
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
		
		
		
		
		
	}
	

}
