package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.ActorVO;

@Component
public class ActorAPI_DeleteActorsTestRunner implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//api end point url
		String  url="http://localhost:7799/BootRestProj10-ActorAPI-SwaggerAPI/actor-api/delete/{cat1}/{cat2}/{cat3}";
		// invoke the endpoint
			template.delete(url,"Hero","comedian","villian");
			  System.out.println("Actor are deleted");
				System.out.println("=====================");
		
	   System.exit(0);
	}

}
