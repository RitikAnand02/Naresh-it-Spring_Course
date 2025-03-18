//DTDC.java  (Dependent class)
package com.nt.sbeans;

import org.springframework.stereotype.Component;

//All dependent class are implemeting the commom interface (rule2, rule3) 
@Component("dtdc")
public final class DTDC implements ICourier {
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid+" order id   order items  are ready to deliver using DTDC Courier SErvice";
	}

}
