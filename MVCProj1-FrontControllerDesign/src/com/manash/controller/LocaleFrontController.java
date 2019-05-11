package com.manash.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manash.handler.CountriesHandler;
import com.manash.handler.LanguageHandler;
import com.manash.handler.LocaleHandler;

@WebServlet("*.do")
public class LocaleFrontController extends HttpServlet {
	 private LocaleHandler handler;
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path=null;
		RequestDispatcher rd=null;
		String lang="lang";
		String country="country";
		//get request virtual path name
		path=req.getServletPath();
		if(path.equalsIgnoreCase("/countries.do")) {
			handler=new CountriesHandler();
			//invoke service class method
			lang=handler.execute(req, res); 
		}
		else if(path.equalsIgnoreCase("/languages.do")){
            handler=new LanguageHandler();
            //invoke service class method
            country=handler.execute(req, res);
		}
		else
			throw new IllegalArgumentException("Invalid URL");
		
		if(lang.equalsIgnoreCase("lang")) {
			rd=req.getRequestDispatcher("languages.jsp");
			rd.forward(req, res);
		}
		else {
			rd=req.getRequestDispatcher("countries.jsp");
			rd.forward(req,res);
		}
			
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
