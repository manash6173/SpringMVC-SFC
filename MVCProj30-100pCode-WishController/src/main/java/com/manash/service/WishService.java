package com.manash.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class WishService {
	
	public String getWish() {
		Calendar cal=null;
		//get todays data and time
		cal=Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			return "GoodMorning";
		else if(hour<16)
			return "GoodAfterNoon";
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night";
	}
}
