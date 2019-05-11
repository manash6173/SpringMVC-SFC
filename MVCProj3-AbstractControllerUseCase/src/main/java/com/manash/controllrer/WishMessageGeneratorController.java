package com.manash.controllrer;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageGeneratorController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String msg=null;
		ModelAndView mav=null;
         //get Todays date and time
		Calendar cal=Calendar.getInstance();
		//get hour of the day
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good AfterNoon";
		else if(hour<20)
			msg="Good Evening";
		else
			msg="Good Night";
		//create MAV object
		mav=new ModelAndView();
		//add model data into MAV object
		mav.addObject("wish", msg);
		mav.addObject("date", new Date());
		//add logical view name
		mav.setViewName("wish");
		return mav;
	}
}
