package com.manash.handler;



import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountriesHandler implements LocaleHandler {

	/**
	 * This Method gives the logical name 
	 * And keeps the generated output in request scope 
	 * @param HttpServletRequest,HttpServletResponse
	 * @return String
	 */
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		Locale locales[]=null;
		String countryList[]=null;
		int i=0;
		//create Locale class object 
		locales=Locale.getAvailableLocales();
		countryList=new String[locales.length];
		for(Locale lc:locales) {
			countryList[i]=lc.getDisplayCountry();
			i++;
		}
		//keeps the generated output in the request scope
	    req.setAttribute("country", countryList);
		return "country";
	}
}
