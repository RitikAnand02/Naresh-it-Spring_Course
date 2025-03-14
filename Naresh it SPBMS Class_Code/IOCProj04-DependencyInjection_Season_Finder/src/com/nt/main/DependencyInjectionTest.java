package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;
public class DependencyInjectionTest {
public static void main(String[] args) {
	
	/*	FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");*/

	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
	// get Target spring bean class obj ref
	SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
	
	//invoke the b.method
String result=finder.findSeason();
System.out.println("Seaons name ::"+result);
// close the IOC container
ctx.close(); 
}
}
