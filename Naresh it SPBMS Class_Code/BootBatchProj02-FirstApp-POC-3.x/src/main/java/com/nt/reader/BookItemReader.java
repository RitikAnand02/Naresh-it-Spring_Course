package com.nt.reader;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component
public class BookItemReader implements ItemReader<String> {
	private List<String>  booksList=List.of("CRJ", "TIJ", "EJ", "HFJ","BBJ");
    private int i=0;
	
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("BookItemReader.read()");
		if(i<booksList.size())
			 return  booksList.get(i++);
		else
		return null;
	}

}
