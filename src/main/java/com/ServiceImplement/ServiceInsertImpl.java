package com.ServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Beans.RegBean;
import com.DaoInterface.RegInsertInterface;
import com.ServiceInterface.ServiceInsertInter;

@Service
public class ServiceInsertImpl implements ServiceInsertInter{
	@Autowired
	RegInsertInterface i;
	public int InsertRecord(RegBean rbean) {
		// TODO Auto-generated method stub
		return i.InsertRecord(rbean);
	}
	
}
