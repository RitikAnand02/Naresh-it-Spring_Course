package com.nt.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
	
	@Autowired
	private  KafkaTemplate<String, String > template;
	@Value("${app.tpc.name}")
	private  String tpcName;
	
	
	public  String sendMessage(String  msg) {
		template.send(tpcName,msg);
		return  "Message    Sent";
	}
	

}
