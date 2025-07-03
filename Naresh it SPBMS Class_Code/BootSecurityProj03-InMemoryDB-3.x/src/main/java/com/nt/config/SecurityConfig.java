package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.NoOpAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity	  // To  get default Security cfgs
@EnableMethodSecurity  //To recognize  method  level authorization
public class SecurityConfig  {
	
	
	@Bean   //For Authentication and  Authorization
  public   SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.csrf((csrf) -> csrf.disable())
                .authorizeHttpRequests((requests)->requests
                		 .requestMatchers("/bank/welcome").permitAll()
                        .requestMatchers("/bank/balance","/bank/loan_approve","/bank/offers").authenticated())
                        .formLogin(Customizer.withDefaults());
                
        return http.build();
    }

	
	@Bean
    public InMemoryUserDetailsManager userDetailsService() {
        //*Approach 1 where we use withDefaultPasswordEncoder() method	while creating the user details//*
        
	/*	UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("12345")
                .authorities("admin")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("12345")
                .authorities("read")
                .build();
        return new InMemoryUserDetailsManager(admin, user);*/

         //*Approach 2 where we use NoOpPasswordEncoder Bean	while creating the user details//*
        UserDetails user1 = User.withUsername("raja")
                .password(encoder().encode("rani"))
                .authorities("CUSTOMER")  //role
                .build();
        UserDetails user2= User.withUsername("mahesh")
                .password(encoder().encode("hyd"))
                .authorities("MANAGER","CUSTOMER")
                .build();
        return new InMemoryUserDetailsManager(user1, user2);

    }
	
	   @Bean
	    public PasswordEncoder encoder() {
	        return new BCryptPasswordEncoder();
	    }

	
	
	

}
