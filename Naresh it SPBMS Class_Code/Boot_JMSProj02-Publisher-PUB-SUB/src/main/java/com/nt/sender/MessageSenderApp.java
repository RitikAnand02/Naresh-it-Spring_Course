package com.nt.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderApp implements CommandLineRunner {
	
	@Autowired
	private JmsTemplate template;

	@Override
	public void run(String... args) throws Exception {
      // using LAMBDA style anonymous inner class
		template.send("testmq",ses->ses.createTextMessage("Hello Everyone ::"+new Date()));
		System.out.println("Message Sent");

	}

}
