package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.WishMessageGenerator;
public class DependencyInjectionTest {
public static void main(String[] args) {
System.out.println("DependencyInjection Test.main()");

//create IOC Container
FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");

//get Target Spring bean class obj ref
Object obj=ctx.getBean("wmg");
WishMessageGenerator generator=(WishMessageGenerator)obj;

//invoke the b.method
String result=generator.showWishMessage("Ritik"); 
System.out.println("Result is ::"+result);
//close the IOC cotnainer
ctx.close();
System.out.println("DependencyInjection Test.main()");
}
}