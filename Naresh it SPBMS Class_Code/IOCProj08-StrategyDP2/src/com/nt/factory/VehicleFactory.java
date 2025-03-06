package com.nt.factory;

import com.nt.comps.DieselEngine;
import com.nt.comps.ElectricEngine;
import com.nt.comps.Engine;
import com.nt.comps.PetrolEngine;
import com.nt.comps.Vehicle;

public class VehicleFactory {

	public static Vehicle getEngine(String engineType) {
		Engine engine = null;
		
		if(engineType.equalsIgnoreCase("Petrol")) {
			engine = new PetrolEngine();
		}
		else if(engineType.equalsIgnoreCase("Diesel")) {
			engine = new DieselEngine();
		}
		else if(engineType.equalsIgnoreCase("Eletric")) {
			engine = new ElectricEngine();
		}
		else
			throw new IllegalArgumentException("Invalid Engine Type");
		
		Vehicle v1 = new Vehicle();
		v1.setEngine(engine);
		
		return v1;
	}
}
