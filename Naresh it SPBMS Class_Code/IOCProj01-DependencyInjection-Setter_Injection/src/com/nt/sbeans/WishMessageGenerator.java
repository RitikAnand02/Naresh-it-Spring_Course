package com.nt.sbeans;

import java.time.LocalTime;
public class WishMessageGenerator {
private LocalTime time;
//setter method for setter Injection
public void setTime(LocalTime time) {
this.time=time;
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
