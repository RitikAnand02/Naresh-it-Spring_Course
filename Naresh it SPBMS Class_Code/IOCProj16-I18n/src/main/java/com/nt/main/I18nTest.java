package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class I18nTest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=
				        new AnnotationConfigApplicationContext(AppConfig.class);
		//gather Locale  language and  country  infomation from the enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Language Code::");
		String  lang=sc.next();
		System.out.println("Enter Country Code::");
		String  country=sc.next();
		//create Locale object
		Locale locale=new Locale(lang,country);
		// get messages from the properties file  based on the given Locale 
		String msg1=ctx.getMessage("welcome.message", new Object[] {"raja"}, "good morning", locale);
		String msg2=ctx.getMessage("register.user", new Object[] { }, "adding user", locale);
		String msg3=ctx.getMessage("edit.user", new Object[] { }, "updating the user", locale);
		String msg4=ctx.getMessage("remove.user", new Object[] { }, "deleting the user", locale);
		
		//display the content
		System.out.println(msg1+"  "+msg2+"  "+msg3+"  "+msg4);
		
		//close  the IOC container
		ctx.close();
		

	}

}
