package com.nt.comps;

public final class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
		return oid+" order id items are kept for delivery by BlueDart";
	}

}
