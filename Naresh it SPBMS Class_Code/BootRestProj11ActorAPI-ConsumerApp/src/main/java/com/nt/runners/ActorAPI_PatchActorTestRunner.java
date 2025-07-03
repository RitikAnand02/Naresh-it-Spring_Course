package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.BootRestProj11ActorApiConsumerApp;
import com.nt.vo.ActorVO;

//@Component
public class ActorAPI_PatchActorTestRunner implements CommandLineRunner {

   @Autowired
	private  RestTemplate  template;

   
	@Override
	public void run(String... args) throws Exception {
		//api end point url
		String  url="http://localhost:7799/BootRestProj10-ActorAPI-SwaggerAPI/actor-api/update/{aid}/{percent}";
		  //  set special factory
		 template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		// invoke the endpoint
			       String body=template.patchForObject(url,null,String.class,16,10.0);
			       System.out.println("response content is ::"+body);
			System.out.println("=====================");
			
			  System.exit(0);
	}

}
