package com.nt.main;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {
    public static void main(String[] args) {
		Flipkart fpkt = FlipkartFactory.getInstance("Bluedart");
		
		String resultMsg = fpkt.shopping(new String[]{"White Shrit","Black Shoe", "Black Shoe"}, new double[]{3000.0,1500.0,2500.0});
		
		System.out.println(resultMsg);
			
	}
}
