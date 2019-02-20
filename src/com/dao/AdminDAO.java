package com.dao;

import java.util.List;

import com.bean.Employees;
import com.bean.EmployeesLog;
import com.bean.VisitorLog;

public interface AdminDAO {

	//ͨ��������֤
	public  boolean CheckEmployeeByPwd(String eid,String epwd);
	//ͨ��ָ����֤
	public  boolean CheckEmployeeByFinger(String eid,String fingerprint);
	//ͨ��������֤
	public  boolean CheckEmployeeByCard(String eid,String card);
	//�õ����й�Ա��Ϣ
	public List<Employees> GetAllEmployees();
	//�õ����й�Ա��־��Ϣ
	public List<EmployeesLog> GetAllEmployeesLog();
	//�õ����зÿ���־��Ϣ
	public List<VisitorLog> GetAllVisitorLog();
	//ͨ���������ҹ�Ա
	public boolean FindEmployeeByName(String ename);//id  ɾ�� 
	//���� 
	public boolean AdminCloseDoor();
	//����
	public boolean AdminOpenDoor();
	//�����Ա;
	public boolean InsertEmployees(Employees employees);
	
	//�޸Ĺ�Ա
	public boolean UpdateEmployee(Employees employees);
}
