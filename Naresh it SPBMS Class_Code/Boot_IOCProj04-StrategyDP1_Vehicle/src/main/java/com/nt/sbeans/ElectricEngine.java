package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public final class  ElectricEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("ElectricEngine.startEngine()");

	}

	@Override
	public void endEngine() {
		System.out.println("ElectricEngine.endEngine()");

	}

}
