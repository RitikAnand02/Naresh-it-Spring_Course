package com.nt.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.store.MessageStore;

@Component
public class KafkaMessageListener {
	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics = "${app.tpc.name}",groupId = "grp1")
	public   void    readMessage(String msg) {
		//add the  message to store
		store.addMessage(msg);
	}

}
