package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsProj010BillingProducerApp {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj010BillingProducerApp.class, args);
	}

}
