package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WeekDayFinder;
public class DependencyInjectionTest {
public static void main(String[] args) { 
//	Create IOC container
AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
//get target Spring bean class obj ref 
Object obj=ctx.getBean("wdf");
//type casting
WeekDayFinder finder=(WeekDayFinder)obj; 
//invoke the b.methods
String msg=finder.showMessage("Ritik");
System.out.println("Result is::"+msg);
System.out.println();
System.out.println("-----------------------------------------------------------------------------");

System.out.println("All the Bean ids are ::" + Arrays.toString(ctx.getBeanDefinitionNames()));
//close the IOC container
ctx.close();
}
}