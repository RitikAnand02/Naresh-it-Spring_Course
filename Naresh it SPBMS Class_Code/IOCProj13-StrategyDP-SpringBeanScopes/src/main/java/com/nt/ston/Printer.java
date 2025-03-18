//Printer.java (singleton)
package com.nt.ston;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("prn")
//@Scope("singleton")
//@Scope("prototype")
public class Printer {
	  //  static reference variable
	private static Printer INSTANCE;  
	
	//private constructor
	private Printer() {
		System.out.println("Printer:0-param constructor");
	}
	
	//static factory method  having  signleton logic 
	public  static  Printer  getInstance() {
		System.out.println("Printer.getInstance()");
		if(INSTANCE==null)
			INSTANCE=new Printer();
		
		return INSTANCE;
	}
	
	//b.method
	public  void  printData(String msg) {
		System.out.println("Data is ::"+msg);
	}

}
