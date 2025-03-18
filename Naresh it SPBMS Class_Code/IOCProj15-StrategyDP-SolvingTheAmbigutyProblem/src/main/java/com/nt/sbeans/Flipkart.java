//Flipkart.java (target class)
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
 // class final is taken final class (rule3)
@Component("fpkt")
@Lazy(true)
public final class Flipkart {
	//HAS -A property (Composition ) -Rule1   ,  Coding with Interfaces  (rule2)
	
	//@Autowired
	//@Qualifier("dtdc")
	//@Qualifier("courier.id")  // will not work  becoz  here courier.id is not taken as bean id , it is  taken as the key
	//@Qualifier(@Value("${courier.id}"))  // will not work  becoz   @Value can not be used from  @Qualifier annotation
	/*@Value("${courier.id}")
	private  String id; 
	@Qualifier(id)  // will not  work  becoz  we can not  use variable as the  param values of @Qualifier(-) annotation
	*/
	@Autowired
	@Qualifier("shipment")
	private ICourier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	//setter method  for setter Injection
	public  void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	// b.method
	public  String  shopping(String [] items , double[] prices) {
		System.out.println("Flipkart.shopping()");
		//calculate  bill amount
		double total=0.0;
		for(double p: prices) {
			total=total+p;
		}
		// generate the  psudeo random number as the order id
		   Random random=new Random();
		   int oid=random.nextInt(100000);
		//go  for deliver of the products (use the  courier)
		String msg=courier.deliver(oid);
		//prepare the final message
		return  Arrays.toString(items)+"  are purchased having prices::"+Arrays.toString(prices)+" with bill amount::"+total+" ---->"+msg;
	}
	
	

}
