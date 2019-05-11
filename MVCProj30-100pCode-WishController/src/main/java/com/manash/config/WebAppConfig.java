package com.manash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages={"com.manash.controller"})
@EnableWebMvc
public class WebAppConfig {
	
	@Bean
	public ViewResolver homeResolver() {
		System.out.println("WebAppConfig.homeResolver()");
		InternalResourceViewResolver irvr=null;
		//create Resolver class object
		irvr=new InternalResourceViewResolver("/WEB-INF/pages/",".jsp");
		return irvr;
	}

}
