package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.A;
public class CyclicInjection {
public static void main(String[] args) {
//create IOC container
FileSystemXmlApplicationContext ctx=
new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");

// get spring bean class obj ref
A a1 =(A)ctx.getBean("a1");
System.out.println(a1);

//close the container 
ctx.close();
}
}

