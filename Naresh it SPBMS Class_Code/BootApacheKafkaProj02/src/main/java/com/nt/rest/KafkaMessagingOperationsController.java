package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.producer.MessageProducer;
import com.nt.store.MessageStore;

@RestController
@RequestMapping("/messaging-api")
public class KafkaMessagingOperationsController {
	@Autowired
	private   MessageProducer producer;
	@Autowired
	private  MessageStore  store;
	
	
	@GetMapping("/send")
	public  ResponseEntity<String>  sendMessage(@RequestParam(name="message") String  msg){
		//use  producer
		String resultMsg=producer.sendMessage(msg);
		return  new  ResponseEntity<String>(resultMsg,HttpStatus.OK);
	}
	
	@GetMapping("/readAll")
	public   ResponseEntity<List<String>>  showAllMessages(){
		//use store
		List<String> list=store.showAllMessages();
		
		return new  ResponseEntity<List<String>>(list,HttpStatus.OK);
		
	}

}
