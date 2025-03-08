package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public final class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
		return oid+" order id items are kept for delivery by BlueDart";
	}

}
