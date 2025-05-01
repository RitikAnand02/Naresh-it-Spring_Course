package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IpurchaseOrder;

@SpringBootApplication
public class BootMailProj01Application {

	public static void main(String[] args) {
		ApplicationContext ctx=	SpringApplication.run(BootMailProj01Application.class, args);
		
		// get Serivce class object ref 
		IpurchaseOrder order=ctx.getBean("purchaseService",IpurchaseOrder.class); 
		//invoke method 
		try { 
		String msg=order.purchase(new String[] {"shirt","trouser","watch"}, 
		new double[] {5000,6000,7000}, 
		new String[] {"ritikanand.02062000@gmail.com","anandritik9835@gmail.com"}); 
		System.out.println(msg); 
		} 
		catch(Exception e) { 
		e.printStackTrace(); 
		} 
		//close container 
		((ConfigurableApplicationContext) ctx).close(); 
		
	}

}
