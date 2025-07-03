package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
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
		ResponseEntity<String> resp=
				   template.exchange(url, HttpMethod.GET, null,String.class);
		String jsonContent=resp.getBody();
		System.out.println("json content  as String ::"+jsonContent);
		
		//convert jsoncontent to  List<ActorVO> class object
		ObjectMapper mapper=new ObjectMapper();
		List<ActorVO> list=mapper.readValue(jsonContent,new TypeReference<List<ActorVO>>() {	});
		list.forEach(System.out::println);
		
	   System.exit(0);
	}

}
