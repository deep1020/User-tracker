package com.DaoImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Beans.LoginBean;
import com.DaoInterface.LoginInterface;

@Transactional
@Repository

public class LoginImpl implements LoginInterface{

	@Autowired
	JdbcTemplate jt;
	
	public int getAutoid(LoginBean lbean) {
		
		int uid = 0;		
		try
		{
			StringBuilder sb=new StringBuilder();
			sb.append("SELECT regID FROM deep_springmvc.register WHERE email=? AND pass=?");
			
			
			uid = jt.queryForObject(sb.toString(), new Object[] {
					lbean.getEmail(),lbean.getPassword()
			}, int.class);
			System.out.println("Your User ID =" + uid);
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return uid;
	}
}
