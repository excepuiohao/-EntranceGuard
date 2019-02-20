package com.dao;

import java.util.List;

import com.bean.Employees;
import com.bean.EmployeesLog;
import com.bean.VisitorLog;

public interface AdminDAO {

	//通过密码验证
	public  boolean CheckEmployeeByPwd(String eid,String epwd);
	//通过指纹验证
	public  boolean CheckEmployeeByFinger(String eid,String fingerprint);
	//通过卡号验证
	public  boolean CheckEmployeeByCard(String eid,String card);
	//得到所有雇员信息
	public List<Employees> GetAllEmployees();
	//得到所有雇员日志信息
	public List<EmployeesLog> GetAllEmployeesLog();
	//得到所有访客日志信息
	public List<VisitorLog> GetAllVisitorLog();
	//通过姓名查找雇员
	public boolean FindEmployeeByName(String ename);//id  删除 
	//关门 
	public boolean AdminCloseDoor();
	//开门
	public boolean AdminOpenDoor();
	//插入雇员;
	public boolean InsertEmployees(Employees employees);
	
	//修改雇员
	public boolean UpdateEmployee(Employees employees);
}
