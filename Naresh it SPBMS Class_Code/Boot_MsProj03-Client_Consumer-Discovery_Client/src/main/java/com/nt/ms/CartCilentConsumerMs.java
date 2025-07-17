package com.nt.ms;

import java.util.Random;

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
		
		String resultBody = cilent.getBillingInfo();
		
		String billInfo="Bill Amount::"+ new Random().nextInt(10000);
		
		return new ResponseEntity<String>(billInfo+"----"+resultBody,HttpStatus.OK);
		
	}
	
}
