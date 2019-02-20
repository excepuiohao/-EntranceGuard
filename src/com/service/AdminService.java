package com.service;

import java.util.List;

import com.bean.Employees;
import com.bean.EmployeesLog;
import com.bean.VisitorLog;

public interface AdminService {
	// ͨ��������֤
	public boolean CheckEmployeeByPwd(String eid, String epwd);

	// ͨ��ָ����֤
	public boolean CheckEmployeeByFinger(String eid, String fingerprint);

	// ͨ��������֤
	public boolean CheckEmployeeByCard(String eid, String card);

	// �õ����й�Ա��Ϣ
	public List<Employees> GetAllEmployees();

	// ͨ���������ҹ�Ա
	public boolean FindEmployeeByName(String ename);

	// ����
	public boolean AdminCloseDoor();

	// ����
	public boolean AdminOpenDoor();

	// �õ����й�Ա��־��Ϣ
	public List<EmployeesLog> GetAllEmployeesLog();

	// �õ����й�Ա��־��Ϣ
	public List<VisitorLog> GetAllVisitorLog();

	// �����Ա
	public boolean InsertEmployees(Employees employees);
	//�޸Ĺ�Ա
		public boolean UpdateEmployee(Employees employees);
	
}
