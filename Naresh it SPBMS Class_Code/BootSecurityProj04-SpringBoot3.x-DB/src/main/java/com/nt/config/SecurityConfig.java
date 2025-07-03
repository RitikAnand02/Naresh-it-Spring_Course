//SecurityConfig.java
package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity	
@EnableMethodSecurity
public class SecurityConfig  {
	
	
	@Bean
  public   SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests)->requests
                		 .requestMatchers("/bank/welcome").permitAll()
                        .requestMatchers("/bank/balance","/bank/loan_approve","/bank/offers").authenticated())
                        .formLogin(Customizer.withDefaults());
                
        return http.build();  //returns  DefaultSecurityFilterChain obj  which  is the impl class obj of SecurityFilterChain(I)
    }

	   @Bean
	   public  UserDetailsManager   createJdbcUDM(DataSource ds) {
		   return   new JdbcUserDetailsManager(ds);  //For this  we  need    db tables and their cols having  fixed names
	   }
	   
	   @Bean
	    public BCryptPasswordEncoder encoder() {
	        return new BCryptPasswordEncoder();
	    }
	
	
		
	  
}
