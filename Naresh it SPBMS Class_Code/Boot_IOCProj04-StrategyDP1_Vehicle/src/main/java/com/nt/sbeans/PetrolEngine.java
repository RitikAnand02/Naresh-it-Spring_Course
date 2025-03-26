package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public final class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
       System.out.println("PetrolEngine.startEngine()");
	}

	@Override
	public void endEngine() {
		System.out.println("PetrolEngine.endEngine()");

	}

}
