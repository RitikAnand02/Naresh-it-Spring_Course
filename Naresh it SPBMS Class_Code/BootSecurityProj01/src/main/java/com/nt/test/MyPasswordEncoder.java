package com.nt.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyPasswordEncoder {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		 String pwd1=encoder.encode("rani");
		 String pwd2=encoder.encode("hyd");
		 String pwd3=encoder.encode("delhi");
		 String pwd4=encoder.encode("vizag");
		 System.out.println(pwd1);
		 System.out.println(pwd2);
		 System.out.println(pwd3);
		 System.out.println(pwd4);
		 
		 
		 
		 
	}

}
