package com.manash.handler;



import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LanguageHandler implements LocaleHandler {
    
	/**
	 * This Method gives the logical name 
	 * And keeps the generated output in request scope 
	 * @param HttpServletRequest,HttpServletResponse
	 * @return String
	 */
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		Locale locales[]=null;
		String[] lang=null;
		int i=0;
		//create locale class objest
		locales=Locale.getAvailableLocales();
		lang=new String[locales.length];
		for(Locale lc:locales) {
			lang[i]=lc.getDisplayLanguage();
			i++;
		}
		//keep lang object into request scope
		req.setAttribute("language1",lang);
		
		return "lang";
	}
}
