package com.nt.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingClientConsumer {

	@Autowired
	private LoadBalancerClient client;
	
	public String getBillingInfo() {
		ServiceInstance instance =client.choose("Billing_Producer");
		
		URI uri=instance.getUri();
		
		String url=uri.toString()+"/billing-api/billing";
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> response =template.getForEntity(url, String.class);
		
		String responseContent=response.getBody();		
		
		return responseContent;
	}
}
