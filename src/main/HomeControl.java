package com.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DaoImplement.totalusers;
import com.DaoImplement.totalusers;

@Controller
public class HomeControl {
	
	@Autowired
	ServletContext context;

	@Autowired
	totalusers tuser;
	
	@RequestMapping("/RegPage")    
	public String display()
	{
		return "RegPage";
	}
	@RequestMapping("/LoginPage")    
	public String logindisplay()
	{
		return "LoginPage";
	}
	
	@RequestMapping("/totalusers")
	public ModelAndView List(ModelAndView model) throws Exception{
		int val=tuser.totUser();  //call function of totUser in totalusers.java
		System.out.println("Total Users "+val);
		model.addObject("TotalUsers",val);
		model.setViewName("display");
		return model;
		
	}
}
