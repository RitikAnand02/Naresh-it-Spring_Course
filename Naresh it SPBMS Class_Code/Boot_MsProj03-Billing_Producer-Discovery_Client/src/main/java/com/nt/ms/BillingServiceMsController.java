package com.nt.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingServiceMsController {
     
	@GetMapping("/billing")
	public String getBillingInfo() {
		return "we accept Card Payment, UPI Payment, Net Banking Payment, COD";
	}
}
