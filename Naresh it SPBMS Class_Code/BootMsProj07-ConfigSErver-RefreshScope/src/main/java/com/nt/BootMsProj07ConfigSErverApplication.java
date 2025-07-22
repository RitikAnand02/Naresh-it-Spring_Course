package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootMsProj07ConfigSErverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj07ConfigSErverApplication.class, args);
	}

}
