package com.conversion.spring;

import java.text.DateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HomeController implements Controller{

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	public ModelAndView  handleRequest(HttpServletRequest request, HttpServletResponse response) {
		logger.info("  Welcome home! The client locale is {}.");
		 
		System.out.println("  Welcome home! The client locale is {}.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		
		request.setAttribute("serverTime", formattedDate );
		
		return  new ModelAndView("home", "helloview", formattedDate);
	}
}
