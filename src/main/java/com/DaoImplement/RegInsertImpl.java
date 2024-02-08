package com.DaoImplement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Beans.LoginBean;
import com.Beans.RegBean;
import com.DaoInterface.RegInsertInterface;

@Transactional
@Repository
public class RegInsertImpl implements RegInsertInterface {

	@Autowired
	JdbcTemplate jt;
	
	
	public int InsertRecord(final RegBean rbean) {
		
		StringBuilder sb=new StringBuilder();
		sb.append("insert into deep_springmvc.register(fname,pno,email,pass,countuser) values(?,?,?,?,?)");
		
		System.out.println("Data Inserted");
		
		return jt.update(sb.toString(),new PreparedStatementSetter() {
			
			//Go on PreparedStatementSetter -> add unimplemented method -> Generate setValues method automatically
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				try
				{
					ps.setString(1, rbean.getFullname());
					ps.setString(2, rbean.getPno());
					ps.setString(3, rbean.getEmail());
					ps.setString(4, rbean.getPass());
					ps.setInt(5, rbean.getCounterid());
				}
				catch (Exception e) {
					System.out.println(e.toString());
				}
			}			
		});			
	}
	public int checkemail(RegBean rbean) {
		
		int uid = 0;		
		try
		{
			StringBuilder sb=new StringBuilder();
			sb.append("SELECT regID FROM deep_springmvc.register WHERE email=?");
			
			
			uid = jt.queryForObject(sb.toString(), new Object[] {
					rbean.getEmail()
			}, int.class);
			//System.out.println("Your User ID =" + uid);
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return uid;
	}

}
