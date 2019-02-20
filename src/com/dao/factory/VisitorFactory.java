package com.dao.factory;

import com.dao.VisitorDAO;
import com.proxy.VisitorDAOProxy;

public class VisitorFactory {
	public static VisitorDAO getVisitorDAOInstance(){
		return new VisitorDAOProxy() ;
	}
}
