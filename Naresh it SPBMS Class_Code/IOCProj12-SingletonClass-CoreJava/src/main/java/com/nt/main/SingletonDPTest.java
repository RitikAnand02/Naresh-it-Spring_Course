package com.nt.main;

import com.nt.ston.Printer;

public class SingletonDPTest {

	public static void main(String[] args) {
		//get Access to  the Object
		Printer prn1=Printer.getInstance();
		Printer  prn2=Printer.getInstance();
		System.out.println(prn1.hashCode()+"   "+prn2.hashCode());
		
		
		//check wheather both reference variables  are pointing to same   object or not
		System.out.println("prn1==prn2?"+(prn1==prn2));
		
		//invoke the b.method
	       prn1.printData("hai");
	       prn2.printData("hello");
	}


}
