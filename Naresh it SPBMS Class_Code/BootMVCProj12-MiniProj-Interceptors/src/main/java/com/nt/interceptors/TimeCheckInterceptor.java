//TimeCheckInteceptor.java
package com.nt.interceptors;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TimeCheckInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)throws Exception {
		System.out.println("TimeCheckInteceptor.preHandle()");
   if(!req.getServletPath().equalsIgnoreCase("/")) {		
		//get System date and time
		LocalDateTime  ldt=LocalDateTime.now();
		//get current hour of the day
		int hour=ldt.getHour();  //24 hours format
		if(hour<9 || hour>=18) {
			RequestDispatcher  rd=req.getRequestDispatcher("timeout.jsp");
			rd.forward(req, res);
			return false;
		}
   }
   return true;
  	}

}
