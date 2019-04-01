package com.manash.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.manash.command.StudentCommand;

public class StudentRegisterController extends SimpleFormController {
	
	@Override
	public Map<String,List<String>> referenceData(HttpServletRequest request) throws Exception {
		
		System.out.println("CustomerController.referenceData()");
		
		Map<String,List<String>> map=new HashMap<String,List<String>>();
		
		List<String> gendersList=null;
		List<String> countriesList=null;
		List<String> coursesList=null;
		List<String> hobiesList=null;
		
		//store gender values 
		gendersList=new ArrayList<String>();
		gendersList.add("male");gendersList.add("female");gendersList.add("Others");
		//put into map collection 
		map.put("genders", gendersList);
		
		//store countries 
		countriesList=new ArrayList<String>();
		countriesList.add("--select--");
		countriesList.add("india");countriesList.add("USA");
		countriesList.add("UK");countriesList.add("canada");
		countriesList.add("china");countriesList.add("Japan");
		countriesList.add("Austrial");
		//put into map collection
		map.put("countries", countriesList);
		
		//store courses
		coursesList=new ArrayList<String>();
		coursesList.add("Core Java");coursesList.add("Adv-Java");
		coursesList.add("Servlet");  coursesList.add("JSP");
		coursesList.add("Hibernate");coursesList.add("Spring");
		coursesList.add("Oracle");   coursesList.add("UI");
		//put into map collection
		map.put("courses", coursesList);
		
		//store hobies
		hobiesList=new ArrayList<String>();
		hobiesList.add("sleeping");hobiesList.add("eating");
		hobiesList.add("travling");  hobiesList.add("reading");
		//put into map collection
		map.put("hobies", hobiesList);
		                         
		return map;
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		//type cast to command class object
		StudentCommand cmd=(StudentCommand)command;
		
		return new ModelAndView(getSuccessView(),"cmd",cmd);
	}

}
