package com.nt.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageRecieverApp {

	@JmsListener(destination = "testmq")
	public void readMessage(String text) {

		System.out.println("Recieved Message ::"+text);
	}
}
