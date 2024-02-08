package com.Beans;

import javax.persistence.Entity;

@Entity
public class RegBean {

	int id;
	String fullname,pno,email,pass;
	int counterid,totaluser;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public int getCounterid() {
		return counterid;
	}
	public void setCounterid(int counterid) {
		this.counterid = counterid;
	}
	
	public int getTotaluser() {
		return totaluser;
	}
	public void setTotaluser(int totaluser) {
		this.totaluser = totaluser;
	}
}
