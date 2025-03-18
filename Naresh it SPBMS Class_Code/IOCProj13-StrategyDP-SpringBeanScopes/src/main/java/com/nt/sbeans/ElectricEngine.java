package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public class ElectricEngine implements IEngine{
	
	public ElectricEngine() {
		System.out.println("EletricEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
         System.out.println("EletricEngine::startEngine()::   Eletric Engine is started");		
	}

	@Override
	public void stopEngine() {
	    System.out.println("EletricEngine.stopEngine():: Eletric  Engine is Stopped");	
	}

}
