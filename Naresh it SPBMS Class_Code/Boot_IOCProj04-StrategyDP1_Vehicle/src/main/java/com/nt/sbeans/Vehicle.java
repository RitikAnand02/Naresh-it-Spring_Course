package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired
	@Qualifier("pEngg")
	private IEngine engine;

	public void setEngine(IEngine engine) {
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
