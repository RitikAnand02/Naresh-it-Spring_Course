package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired
	@Qualifier("dtdc")
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
