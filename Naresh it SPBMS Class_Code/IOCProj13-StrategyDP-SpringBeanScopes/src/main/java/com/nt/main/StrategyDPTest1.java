package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.ston.Printer;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=
				          new AnnotationConfigApplicationContext(AppConfig.class);
		/*	// access the spring bean class obj ref
			Printer prn1=ctx.getBean("prn",Printer.class);
			Printer prn2=ctx.getBean("prn",Printer.class);
			Printer prn3=ctx.getBean("prn",Printer.class);
			System.out.println(prn1.hashCode()+"  "+prn2.hashCode()+" "+prn3.hashCode());
		*/
		
		/*	Printer prn11=ctx.getBean("prn1",Printer.class);
			Printer prn12=ctx.getBean("prn1",Printer.class);
			Printer prn21=ctx.getBean("prn2",Printer.class);
			Printer prn22=ctx.getBean("prn2",Printer.class);
			System.out.println(prn11.hashCode()+"  "+prn12.hashCode()+"  "+prn21.hashCode()+" "+prn22.hashCode());
			*/
	
		
		String beanids[]=ctx.getBeanDefinitionNames();
		System.out.println("Bean ids are ::"+Arrays.toString(beanids));
		
		
	     //close the IOC container
	       ctx.close();
	}
}
