package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.ActorVO;

//@Component
public class ActorAPI_FindByIdTestRunner implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//api end point url
		String  url="http://localhost:7799/BootRestProj10-ActorAPI-SwaggerAPI/actor-api/find/{id}";
		// invoke the endpoint
		/*	ResponseEntity<String>  response=template.getForEntity(url, String.class, 9);
			System.out.println("response content ::"+response.getBody());
			System.out.println("response status code ::"+response.getStatusCode());
			System.out.println("=====================");
			//Convertint  json content  to  ActorVO class obj
			ObjectMapper mapper=new ObjectMapper();
			ActorVO  vo=mapper.readValue(response.getBody(), ActorVO.class);
			System.out.println(vo);
		*/
		
		String  response=template.getForObject(url, String.class, 9);
		System.out.println("output is ::"+response);

		
	   System.exit(0);
	}

}
