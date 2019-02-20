package com.dao.factory;


import com.dao.AdminDAO;
import com.proxy.AdminDAOProxy;

public class AdminFactory {
	public static AdminDAO getAdminDAOInstance(){
		return new AdminDAOProxy() ;
	}
}
