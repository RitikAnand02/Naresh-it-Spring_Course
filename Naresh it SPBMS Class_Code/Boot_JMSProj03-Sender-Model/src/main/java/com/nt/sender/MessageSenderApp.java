package com.nt.sender;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.model.ActorInfo;
@Component
public class MessageSenderApp {
	
	@Autowired
	private JmsTemplate template;

	@Scheduled(cron="0/10 * * * * *")
	public void sendObject(){
     ActorInfo actor = new ActorInfo(1001,"Ritik","Bihar");

     template.convertAndSend("testmq1",actor);
     System.out.println("Model is Send as Message");
     
     
     }

}
