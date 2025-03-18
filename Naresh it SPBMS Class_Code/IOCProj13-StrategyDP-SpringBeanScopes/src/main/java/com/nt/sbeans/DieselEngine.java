package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEngg")
@Lazy(true)
public class DieselEngine implements IEngine{
	
	public DieselEngine() {
		System.out.println("DieselEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
         System.out.println("DieselEngine::startEngine()::   Diesel Engine is started");		
	}

	@Override
	public void stopEngine() {
	    System.out.println("DieselEngine.stopEngine():: Diesel  Engine is Stopped");	
	}

}
