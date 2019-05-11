package com.manash.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {
 
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Calendar cal=null;
		int hour=0;
		String msg=null;
		//get calendar class object
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good AfterNoon";
		else if(hour<18)
		    msg="Good Evening";
		else
			msg="Good Night";
		//create Model And View class object
		ModelAndView mav=new ModelAndView("home","wish",msg);
		return mav;
	}

}
