package com.manash.initalizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.manash.config.RootAppConfig;
import com.manash.config.WebAppConfig;

public class MyWebInitalizer implements WebApplicationInitializer {

	
	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		
		System.out.println("MyWebInitalizer.onStartup()");
		AnnotationConfigWebApplicationContext rootCtx=null,webCtx=null;
		ServletRegistration.Dynamic register=null;
		//create root Application context container and child web mvc container
		rootCtx=new AnnotationConfigWebApplicationContext();
		rootCtx.register(RootAppConfig.class);
		webCtx=new AnnotationConfigWebApplicationContext();
		webCtx.register(WebAppConfig.class);
		//register root container with listener class
		ContextLoaderListener listener =new ContextLoaderListener(rootCtx);
		//add servlet listener to servletContext object
		ctx.addListener(listener);
		//register web container with Dispatcher Servlet
		DispatcherServlet dispatcherServlet=new DispatcherServlet(webCtx);
		register=ctx.addServlet("dispatcher",dispatcherServlet);
		register.addMapping("*.do");
		register.setLoadOnStartup(2);
		
	}
}
