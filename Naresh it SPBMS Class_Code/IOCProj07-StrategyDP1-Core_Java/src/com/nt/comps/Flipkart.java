package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
    private Courier courier;

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
    
    public String shopping(String items[],double prices[]) {
    	double billAmount=0.0;
    	for(double p:prices) {
    		billAmount =billAmount+p;
    	}
    	
    	int oid = new Random().nextInt(100000);
    	
    	String msg = courier.deliver(oid);
    	
    	return Arrays.toString(items)+"items with BillAmount ::"+billAmount+"--->"+msg;
    }
    
}
