package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import
org.springframework.stereotype.Component;
@Component("wdf")
public class WeekDayFinder {
	
	@Autowired //Field Injection 
	private LocalDate date;
	public WeekDayFinder() {
	System.out.println("WeekDayFinder:: 0-param constructor");
	}
	
	//b.method
	public String showMessage(String user) {
		// get current week day number
		int number=date.getDayOfWeek().getValue();
		// generate the message
		if(number>=1 && number<=5)
		return " Work Hard to build Strong IT Career:" + user;
		else
		return "Take a Break and Enjoy ur weekend:"+user;
	}
	
}
