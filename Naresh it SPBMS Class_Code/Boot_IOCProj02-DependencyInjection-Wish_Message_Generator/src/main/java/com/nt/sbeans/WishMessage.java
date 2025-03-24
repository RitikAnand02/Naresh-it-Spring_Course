package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wm")
public class WishMessage {
	@Autowired
	private LocalTime time;
	
	public WishMessage() {
		System.out.println("WishMessage.WishMessage::0-Param Constructor");
	}
	
	//b.method
	public String showWishMessage(String user) {
	// get current hour of the day
	int hour=time.getHour();
	//generate wish message based on current hour of the day
	if(hour<12)
	return "Good Morning::"+user;
	else if(hour<16)
		return "Good Afternoon:"+user;
	else if(hour<20)
		return "Good Evening :"+user;
	else
	return "Good Night:"+user;
	}
}
