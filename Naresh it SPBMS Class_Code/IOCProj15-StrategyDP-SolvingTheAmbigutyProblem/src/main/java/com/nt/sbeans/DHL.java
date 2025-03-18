//DHL.java  (Dependent class)
package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dhl")
@Lazy(true)
public final class  DHL implements ICourier {
	
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return oid+" order id   order items  are ready to deliver using DHL Courier SErvice";
	}

}
