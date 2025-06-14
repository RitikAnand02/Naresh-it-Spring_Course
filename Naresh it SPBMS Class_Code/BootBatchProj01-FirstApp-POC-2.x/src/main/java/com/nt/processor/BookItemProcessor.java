package com.nt.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class BookItemProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String item) throws Exception {
		System.out.println("BookItemProcessor.process()");
		if(item.equalsIgnoreCase("CRJ"))
			return  item+"-- Patrik";
		else if(item.equalsIgnoreCase("TIJ"))
			 return  item+"--- Bruce";
		else if(item.equalsIgnoreCase("EJ"))
			return item+"---- Jashuva";
		else if(item.equalsIgnoreCase("HFJ"))
			return item+" ---- kathy";
		else if(item.equalsIgnoreCase("BBJ"))
			return item+"--- RNR";
		else
			return  null;
	}

}
