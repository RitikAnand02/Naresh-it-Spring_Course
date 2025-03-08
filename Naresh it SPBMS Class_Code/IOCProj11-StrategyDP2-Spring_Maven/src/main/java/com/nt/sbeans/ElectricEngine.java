package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public class ElectricEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("ElectricEngine.startEngine()");

	}

	@Override
	public void endEngine() {
		System.out.println("ElectricEngine.endEngine()");

	}

}
