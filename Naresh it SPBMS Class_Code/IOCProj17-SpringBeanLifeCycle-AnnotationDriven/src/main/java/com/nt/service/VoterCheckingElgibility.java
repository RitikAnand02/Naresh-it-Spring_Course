package com.nt.service;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("vce")
public class VoterCheckingElgibility {
	@Value("${voter.name}")
	private  String name;
	@Value("${voter.addrs}")
	private   String  addrs;
	@Value("${voter.age}")
	private Integer age;
	
	private   Date  dov;
	
	static {
		System.out.println("VoterCheckingElgibility::static block");
	}
	public VoterCheckingElgibility() {
		System.out.println("VoterCheckingElgibility:: 0-param constructor");
	}
	
	
	@PostConstruct
	public  void myInit() {
		System.out.println("VoterCheckingElgibility.myInit()");
		//initialize  left over spring bean properties
		dov=new Date();
		//check wheather import properties are injected with correct values or not
		if(name==null ||age==null || age<=0)
			throw new IllegalArgumentException("Invalid data for "+name+"...."+age);
	}
	
	//b.mehtod
	public  String   checkVotingElgibility() {
		System.out.println("VoterCheckingElgibility.checkVotingElgibility()");
		if(age<18)
			return "Mr/Miss/Mrs."+name+"  u  r not elgible for voting --> verified on::"+dov;
		else
			return "Mr/Miss/Mrs."+name+"  u  r  elgible for voting--->  verified on ::"+dov;
				
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("VoterCheckingElgibility.myDestroy()");
		//nullifying  the  spring bean properties
		name=null;
		age=null;
		addrs=null;
		dov=null;
	}
	

}
