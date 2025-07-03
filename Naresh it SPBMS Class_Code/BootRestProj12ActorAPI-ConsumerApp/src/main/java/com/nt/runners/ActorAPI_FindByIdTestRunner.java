package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.vo.ActorVO;

import ch.qos.logback.core.net.SyslogOutputStream;

//@Component
public class ActorAPI_FindByIdTestRunner implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//api end point url
		String  url="http://localhost:7799/BootRestProj10-ActorAPI-SwaggerAPI/actor-api/find/{id}";
		// invoke the endpoint
		ResponseEntity<ActorVO>  resp=template.exchange(url, HttpMethod.GET, null, ActorVO.class,16);
		System.out.println("VO class obj data ::"+resp.getBody());
		System.out.println("response status code::"+resp.getStatusCode());
	   System.exit(0);
	}

}
