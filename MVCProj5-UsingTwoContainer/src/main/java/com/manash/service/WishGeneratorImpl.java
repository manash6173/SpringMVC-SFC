package com.manash.service;

import java.util.Calendar;

public class WishGeneratorImpl implements WishGenerator {

	@Override
	public String getWishMsg() {
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
		return msg;
	}

}
