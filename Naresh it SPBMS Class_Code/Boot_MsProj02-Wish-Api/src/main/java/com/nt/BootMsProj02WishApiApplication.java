package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsProj02WishApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj02WishApiApplication.class, args);
	}

}
