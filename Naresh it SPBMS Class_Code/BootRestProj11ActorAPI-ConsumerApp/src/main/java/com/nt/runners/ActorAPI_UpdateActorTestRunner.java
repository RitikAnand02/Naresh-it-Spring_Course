package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.BootRestProj11ActorApiConsumerApp;
import com.nt.vo.ActorVO;

//@Component
public class ActorAPI_UpdateActorTestRunner implements CommandLineRunner {

   @Autowired
	private  RestTemplate  template;

   
	@Override
	public void run(String... args) throws Exception {
		//api end point url
		String  url="http://localhost:7799/BootRestProj10-ActorAPI-SwaggerAPI/actor-api/update";
		// prepare json body
		/*	String json_body = "{"
				    + "\"aname\": \"Rajesh Khanna\","
				    + "\"category\": \"Hero\","
				    + "\"addrs\": \"Mumbai, Maharashtra\","
				    + "\"remunaration\": 1200000.0"
				    + "}";*/
		  ActorVO vo=new ActorVO();
		  vo.setAid(16);
		  vo.setAname("RBK"); vo.setCategory("artist"); vo.setAddrs("vizag");
		  vo.setRemunaration(89001.0);
		  // convert vo object to  json content
		  ObjectMapper  mapper=new ObjectMapper();
		  String json_body=mapper.writeValueAsString(vo);
		  
		 HttpHeaders headers=new HttpHeaders();
		 headers.setContentType(MediaType.APPLICATION_JSON);
		 
		 //  create HttpEntity object having body and header
		 HttpEntity<String> entity=new HttpEntity<String>(json_body, headers);
		 
		
		// invoke the endpoint
			               template.put(url, entity, String.class);
			               System.out.println("Actor  object is  updated");
			System.out.println("=====================");
			
			  System.exit(0);
	}

}
