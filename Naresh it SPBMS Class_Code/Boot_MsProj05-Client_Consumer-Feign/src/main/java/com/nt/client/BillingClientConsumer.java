package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Producer")
public interface BillingClientConsumer {

	@GetMapping("/billing-api/billing")
	public String getBillingInfo();
}
