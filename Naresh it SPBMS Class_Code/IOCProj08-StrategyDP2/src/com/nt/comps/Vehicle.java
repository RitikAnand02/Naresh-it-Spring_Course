package com.nt.comps;

public final class Vehicle {
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
