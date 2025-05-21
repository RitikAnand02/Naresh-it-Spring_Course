package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJms
public class BootJmsProj01SenderModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJmsProj01SenderModelApplication.class, args);
	}

}
