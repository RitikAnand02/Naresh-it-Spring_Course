package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingClientConsumer;

@RestController
@RequestMapping("/cart-api")
public class CartCilentConsumerMs {

	@Autowired
	private BillingClientConsumer cilent;
	
	@GetMapping("/cart")
	public ResponseEntity<String> showCartDetails(){
		
		String resultMsg = cilent.getBillingInfo();
		try {
			Thread.sleep(20000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		System.out.println("shoppingController :: client comp class name::"+cilent.getClass());
		
		return new ResponseEntity<String>("Shoppingthe Items(Shirt,Trouser):: "+resultMsg,HttpStatus.OK);
		
	}
	
}
