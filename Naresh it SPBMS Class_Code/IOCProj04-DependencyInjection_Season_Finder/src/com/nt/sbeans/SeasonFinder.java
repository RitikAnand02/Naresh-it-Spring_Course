package com.nt.sbeans;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired; import
org.springframework.stereotype.Component;
@Component("sf")

public class SeasonFinder {
	private LocalDate date; //HAS-A property
	public SeasonFinder() {
		System.out.println("Season Finder:: O-param constructor");
	}
	
	//setter method for setter Injection (alt+shift+s,r)
	@Autowired
	public void setDate(LocalDate date) {
	System.out.println("SeasonFinder.setDate()");
	this.date=date;
	}
	
	//b.method 
	public String findSeason() {
	//get current month of the year
	int month=date.getMonthValue();
	// find the season name
	if(month>=3 && month<=6)
	return "Summer Season";
	else if(month>=7 && month<=11)
	return "Rainy Season";
	else
	return "winter Season"; 
}
}