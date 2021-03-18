package com.jeet.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OpenController {
	
	
	@RequestMapping("/")
	public String homrPage()
	{
	return "home";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@RequestMapping("/work")
	public String work()
	{
		return "work";
	}

	@RequestMapping("/acheivement")
	public String acheivement()
	{
		return "acheivement";
	}

	@RequestMapping("/contactus")
	public String contactus()
	{
		return "contactus";
	}
	

}
