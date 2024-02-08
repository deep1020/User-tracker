package com.DaoInterface;

import com.Beans.LoginBean;
import com.Beans.RegBean;

public interface LoginCounterInterface {
	public int logincount(LoginBean lbean);
	public int registercount(LoginBean lbean);
}
