//FirstFlight.java  (Dependent class)
package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("fFlight")
@Lazy(true)
public final class  FirstFlight implements ICourier {
	
	public FirstFlight() {
		System.out.println("FirstFlight:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.deliver()");
		return oid+" order id   order items  are ready to deliver using Flight Courier SErvice";
	}

}
