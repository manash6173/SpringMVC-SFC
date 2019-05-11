package com.manash.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manash.service.WishService;


@Controller
public class WishController {
	
	@Autowired
	private WishService service;
	
	//@RequestMapping("/welcome.do")
	@GetMapping(value="/welcome.do")
	public String showHome() {
		return "home";
	}
	//@RequestMapping(value="/wish.do")
	@GetMapping("/wish.do")
	public String wishMsg(Map<String,Object> map) {
		String msg=null;
		//use service
	    msg=service.getWish();	
		map.put("msg", msg);
		return "wish";
	}

}
