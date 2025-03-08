package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired
	@Qualifier("pEngg")
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void journey(String startPlace, String endPlace) {
		engine.startEngine();
		System.out.println("Journey Started From : "+startPlace);
		
		System.out.println("------------------------------------");
		
		engine.endEngine();
		System.out.println("Journey Ended At :"+endPlace);
	}

}
