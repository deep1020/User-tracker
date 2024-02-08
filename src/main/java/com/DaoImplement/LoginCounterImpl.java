package com.DaoImplement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Beans.LoginBean;
import com.DaoInterface.LoginCounterInterface;
import com.DaoInterface.LoginInterface;

@Repository
@Transactional
public class LoginCounterImpl implements LoginCounterInterface{

	@Autowired
	JdbcTemplate jt;
	
	@Autowired
	LoginImpl logimpl;
	
	static int i;
	
	//Add unimplemented Method
	public int logincount(LoginBean lbean) {
		try
		{
			int autoid=logimpl.getAutoid(lbean);
			System.out.println(autoid);
			
			StringBuilder sb=new StringBuilder();
			sb.append("select countuser from deep_springmvc.register where regID=" + autoid + "");
			//System.out.println(sb);
			
			i = jt.queryForObject(sb.toString(), new Object[] {

			}, int.class);
			System.out.println("new i=" + i);

		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		return i;
	}
	
	@Autowired
	LoginCounterImpl count;
	int j,k;

	public int registercount(LoginBean lbean) {
		try
		{
			j=count.logincount(lbean);
			k=j+1;
			System.out.println(k + "times user logged in");
			
			int autoid = logimpl.getAutoid(lbean);// user id
			StringBuilder sb=new StringBuilder();
			sb.append("UPDATE deep_springmvc.register SET countuser='" + k + "' WHERE regID=" + autoid + " ");
			
			return jt.update(sb.toString(), new PreparedStatementSetter() {

				public void setValues(PreparedStatement ps) throws SQLException {
					// TODO Auto-generated method stub
				}
				
			});
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		return k;
	}
	
}
