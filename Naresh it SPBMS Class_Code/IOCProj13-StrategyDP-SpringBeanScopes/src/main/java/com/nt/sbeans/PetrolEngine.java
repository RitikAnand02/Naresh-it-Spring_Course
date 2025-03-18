package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pEngg")
@Scope("prototype")
public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		System.out.println("PetrolEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
         System.out.println("PetrolEngine::startEngine()::   Petrol Engine is started");		
	}

	@Override
	public void stopEngine() {
	    System.out.println("PetrolEngine.stopEngine():: Petrol  Engine is Stopped");	
	}

}
