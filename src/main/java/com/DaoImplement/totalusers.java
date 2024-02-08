package com.DaoImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class totalusers {
	
	@Autowired
	JdbcTemplate jt;
	static int i;
	
	public int totUser()
	{
		try
		{
			StringBuilder sb=new StringBuilder();
			sb.append("SELECT count(regID) FROM deep_springmvc.register;");
			//System.out.println(sb);
			
			i = jt.queryForObject(sb.toString(), new Object[] {

			}, int.class);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		return i;
	}
}
