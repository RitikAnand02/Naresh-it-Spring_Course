package com.nt.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.model.ActorInfo;

@Component
public class MessageRecieverApp {

	@JmsListener(destination = "testmq1")
	public void readMessage(ActorInfo actor) {
     System.out.println("Recieved Model Data ::"+actor);
		
	}
}
