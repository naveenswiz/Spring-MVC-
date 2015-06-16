package com.conversion.spring;

import java.text.DateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class HomeControllerAnnotation{

	private static final Logger logger = LoggerFactory.getLogger(HomeControllerAnnotation.class);
	
	@RequestMapping("/helloannotation.action")
	public String  helloWorld(Model model) {
		logger.info("  Welcome home! The client locale is {}.");
		 
		System.out.println("  Welcome home! The client locale is {}.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
}
