package com.Controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import com.Beans.RegBean;
import com.DaoImplement.RegInsertImpl;
import com.ServiceInterface.ServiceInsertInter;
import com.google.protobuf.TextFormat.ParseException;

//import com.ServiceInterface.ServiceInsertInter;

@Controller
public class RegInsertControl {
	
	@Autowired
	ServletContext context;

	@Autowired
	ServiceInsertInter regService;	
	
	@Autowired
	RegInsertImpl rimpl;
	
//	@RequestMapping(value = "/RegInsert", method = RequestMethod.POST)
//	public String hello()
//	{
//		return "RegPage";
//	}
//	
	static int i;
	@RequestMapping(value = "/RegInsert", method = RequestMethod.POST)
	public @ResponseBody ModelAndView SaveUsers(@RequestParam(value = "fname") String fname,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "mobile") String mobile,
			@RequestParam(value = "password") String password, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ParseException{
		
			ModelAndView mv = new ModelAndView();
		
			System.out.println("YOUR VALUE" + email);
			session.setAttribute("aid", i);
	
			System.out.println(fname + email + mobile + password);
			
			RegBean rbeans = new RegBean();
			rbeans.setFullname(fname);
			rbeans.setEmail(email);
			rbeans.setPno(mobile);
			rbeans.setPass(password);
			
			int check = rimpl.checkemail(rbeans);
			System.out.println("Id = "+check);

//			session = request.getSession();
//			session.setAttribute("id", check);
			
			if(check != 0) 
			{
				System.out.println("This Email is Already Existed");
				String msg = "This Email is Already Existed.. Please try different email";
				mv.addObject("message", msg);
				mv.setViewName("RegPage");
			} 	
			else
			{
				int val = regService.InsertRecord(rbeans);
				System.out.println("Data Inserted "+ val);
	
				if (val == 1) {
		
					mv.setViewName("LoginPage");
		
				}
			}
		
		return mv;
	}
			
			
}
