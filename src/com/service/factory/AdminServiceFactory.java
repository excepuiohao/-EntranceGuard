package com.service.factory;


import com.service.AdminService;
import com.service.impl.AdminServiceImpl;


public class AdminServiceFactory {
	public static AdminService getAdminDAOInstance() {
		return new AdminServiceImpl() ;
	}
	
}
