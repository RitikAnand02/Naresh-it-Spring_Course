package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngg")
public final class DieselEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("DieselEngine.startEngine()");

	}

	@Override
	public void endEngine() {
		System.out.println("DieselEngine.endEngine()");

	}

}
