package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		WeekDayFinder finder = ctx.getBean("wf",WeekDayFinder.class);
		
		//invoke the b.method
		String result=finder.isWeekend();
		System.out.println("Its is ::"+result);
		// close the IOC container
		ctx.close(); 
	}

}
