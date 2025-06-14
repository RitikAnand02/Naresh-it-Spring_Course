package com.nt.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {
	private  List<String> list=new ArrayList();
	
	public  void   addMessage(String msg) {
		 list.add(msg);
	}
	
	public   List<String>  showAllMessages(){
		return  list;
	}

}
