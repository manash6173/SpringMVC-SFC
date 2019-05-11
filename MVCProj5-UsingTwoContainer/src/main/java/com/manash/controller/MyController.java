package com.manash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.manash.service.WishGenerator;

public class MyController implements Controller {
	private WishGenerator wishService;
	
	public MyController(WishGenerator wishService) {
		this.wishService = wishService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String msg=null;
		//invoke service class business method
		msg=wishService.getWishMsg();
		//create Model And View class object
		ModelAndView mav=new ModelAndView("home","wish",msg);
		return mav;
	}

}
