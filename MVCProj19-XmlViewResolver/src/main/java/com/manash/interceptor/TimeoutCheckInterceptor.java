package com.manash.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeoutCheckInterceptor implements HandlerInterceptor {
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler,
			ModelAndView modelAndView) throws Exception {
		long endTime=System.currentTimeMillis();
		System.out.println("PostHandle::"+endTime);
		//get start time from request attribute 
		long startTime=(long) req.getAttribute("startTime");
		System.out.println("Time Taken to process the request::"+(endTime-startTime));
		req.setAttribute("name", "Manash Swain");
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime=System.currentTimeMillis();
	  System.out.println("preHandle::"+startTime);
		request.setAttribute("startTime", startTime);
		request.setAttribute("name", "Manash Kumar Swain");
		return true;
		
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("TimeoutCheckInterceptor.afterCompletion()");
		long afterTime=System.currentTimeMillis();
		System.out.println("afterCompletion::"+afterTime);
		long startTime=(long) request.getAttribute("startTime");
		System.out.println("After Compilation::"+(afterTime-startTime));
		request.setAttribute("name", "Manash Kumar Swain");
	}
}
