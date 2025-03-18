package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("vehicle")
@Component
@Scope("singleton")
//@Scope("prototype")
//@Scope("request")
public class Vehicle {
	@Autowired
	@Qualifier("pEngg")
	private IEngine  engine;
	
	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}
	
	//b.method
	public   void  journey(String startPlace, String destPlace) {
		System.out.println("Vehicle.journey()");
		engine.startEngine();
		System.out.println("Journery  started from ::"+startPlace);
		System.out.println("Jounery is  going on....");
		engine.stopEngine();
		System.out.println("Journery   ended at ::"+destPlace);
	}

}
