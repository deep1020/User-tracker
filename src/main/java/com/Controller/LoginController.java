package com.Controller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Beans.LoginBean;
import com.DaoImplement.LoginCounterImpl;
import com.DaoImplement.LoginImpl;
import com.DaoInterface.LoginInterface;


@Controller
public class LoginController {
	
	@Autowired
	ServletContext context;
	
	@Autowired
	LoginImpl logimpl;
	
	@Autowired
	LoginCounterImpl coimpl;
	
//	@RequestMapping(value = "/LoginSelect")
//	public String hello()
//	{
//		return "LoginPage";
//	}
		
	
	@RequestMapping("/LoginSelect")
	public ModelAndView logindetail(
			@RequestParam(value="email") String email,
			@RequestParam(value="password") String password, HttpServletRequest request, HttpServletResponse response)
	throws EmptyResultDataAccessException,NoSuchAlgorithmException {
		
		System.out.println(email + password);
		
		ModelAndView mv = new ModelAndView();
		LoginBean lbean = new LoginBean();
		lbean.setEmail(email);
		lbean.setPassword(password);
		
		int count = logimpl.getAutoid(lbean);
		System.out.println("Id= "+count);

		HttpSession session = request.getSession();
		session.setAttribute("id", count);		

		if(count == 0) {
			System.out.println("Your Password Wrong!!!");
			String msg = "Invalid Email and Password";
			mv.addObject("msg", msg);
			mv.setViewName("LoginPage");
		} 		
		else
		{
			int i = coimpl.logincount(lbean);
			i++;
			System.out.println("your i num=" + i);

			mv.addObject("countid2", i);
			mv.setViewName("display");
			
			try {

				int valuecount = coimpl.registercount(lbean);

				System.out.println("value Count=" + valuecount);

			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			System.out.println("Login Successfully");
			mv.addObject("id2", count);
			mv.setViewName("display");
		}

		return mv;
		
	}
	
}
