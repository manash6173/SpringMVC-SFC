package com.manash.controller;

import java.util.Calendar;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.ServletContextResourcePatternResolver;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WishController {
	
	/*@RequestMapping("/wish.do")
	public String getWish(Model model) {
		String msg=null;
		//create Calendar class object to get the data and time
		Calendar cal=Calendar.getInstance();
		//get todays hour
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			msg="Good Morning";
		else if(hour<=16)
			msg="Good AfterNoon";
		else if(hour<=20)
			msg="Good Evening";
		else 
			msg="Good Night";
		model.addAttribute("msg",msg);
		System.out.println(model.getClass());
		
		return "wish";
	}*/
	/*@RequestMapping("/wish.do")
	public String getWish(Map<String,Object> model) {
		String msg=null;
		//create Calendar class object to get the data and time
		Calendar cal=Calendar.getInstance();
		//get todays hour
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			msg="Good Morning";
		else if(hour<=16)
			msg="Good AfterNoon";
		else if(hour<=20)
			msg="Good Evening";
		else 
			msg="Good Night";
		model.put("msg", msg);
		System.out.println(model.getClass());
		
		return "wish";
	}*/
	@RequestMapping("/wish.do")
	public void getWish(Map<String,Object> model) {
		String msg=null;
		//create Calendar class object to get the data and time
		Calendar cal=Calendar.getInstance();
		//get todays hour
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			msg="Good Morning";
		else if(hour<=16)
			msg="Good AfterNoon";
		else if(hour<=20)
			msg="Good Evening";
		else 
			msg="Good Night";
		model.put("msg", msg);
		System.out.println(model.getClass());
	}
	
	/*@RequestMapping("/wish.do")
	public ModelAndView getWish(ServletRequest req,ServletResponse res) {
		String msg=null;
		//create Calendar class object to get the data and time
		Calendar cal=Calendar.getInstance();
		//get todays hour
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			msg="Good Morning";
		else if(hour<=16)
			msg="Good AfterNoon";
		else if(hour<=20)
			msg="Good Evening";
		else 
			msg="Good Night";
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", msg);
		mav.setViewName("wish");
		return mav;
	}*/
	
	@RequestMapping("/welcome.do")
	public String showHome() {
		return "home";
	}

}
