package com.tenchael.toauth.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger(HomeController.class);

	@RequestMapping(value = { "/", "/home", "index" })
	public String actionHome(Model model) {
		logger.info("actionHome");
		model.addAttribute("hello", "Hello Tenchael");
		return "home";
	}

}
