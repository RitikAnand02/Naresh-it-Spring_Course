package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.ActorVO;

//@Component
public class ActorAPI_FindAllTestRunner implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//api end point url
		String  url="http://localhost:7799/BootRestProj10-ActorAPI-SwaggerAPI/actor-api/all";
		
		// invoke the endpoint
			ResponseEntity<String>  response=template.getForEntity(url, String.class);
			System.out.println("response content ::"+response.getBody());
			System.out.println("response status code ::"+response.getStatusCode());
			System.out.println("=====================");
			
			//Convertint  json content  to  ActorVO class obj
			ObjectMapper mapper = new ObjectMapper();
			List<ActorVO> listVO = mapper.readValue(response.getBody(), new TypeReference<List<ActorVO>>() {});
			System.out.println(listVO);
			/* TypeReference<List<ActorVO>>() {} tells Jackson the full generic type info at runtime.
                  Without it, Jackson would deserialize to List<LinkedHashMap> instead of List<ActorVO>*/
			
			
		
	   System.exit(0);
	}

}
