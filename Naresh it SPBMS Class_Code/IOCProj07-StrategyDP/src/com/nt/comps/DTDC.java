package com.nt.comps;

public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		return oid+" order id items are kept for delivery by DTDC";
	}

}
