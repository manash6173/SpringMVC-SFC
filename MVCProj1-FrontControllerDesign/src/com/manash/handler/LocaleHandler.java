package com.manash.handler;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LocaleHandler {
	
	public String execute(HttpServletRequest req,HttpServletResponse res);

}
