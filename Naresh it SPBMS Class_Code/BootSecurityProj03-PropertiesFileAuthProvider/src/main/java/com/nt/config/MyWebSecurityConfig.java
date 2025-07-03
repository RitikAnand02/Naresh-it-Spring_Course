package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
	      auth.	
		auth.jdbcAuthentication().dataSource(ds).passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("SELECT USERNAME,PASSWORD,STATUS FROM USERS WHERE USERNAME=?")
		.authoritiesByUsernameQuery("SELECT UNAME,ROLE FROM USERS_ROLES WHERE  UNAME=?");
		
	
	}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		 //Authentication + Authorization confiugrations
		http.authorizeHttpRequests().antMatchers("/").permitAll()
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyAuthority("CUSTOMER","MANAGER")
		.antMatchers("/loan").hasAuthority("MANAGER")
		.and().formLogin()
		.and().logout()
		//.and().httpBasic()
		.and().exceptionHandling().accessDeniedPage("/denied")
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
		
		
		
		
		
	}
	

}
