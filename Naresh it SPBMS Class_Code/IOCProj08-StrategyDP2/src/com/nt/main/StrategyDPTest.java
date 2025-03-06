package com.nt.main;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Vehicle bmw = VehicleFactory.getEngine("Diesel");
		bmw.journey("Bihar", "Hyderabad");

	}

}
