package com.example.mvn.service;

import java.sql.SQLException;

import com.example.mvn.dao.EmployeeDaoImpl;
import com.example.mvn.dao.IEmployeeDao;
import com.example.mvn.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	IEmployeeDao dao=null;
	
	public EmployeeServiceImpl() throws SQLException {
		dao=new EmployeeDaoImpl();
	}
	
	
	
	@Override
	public Employee getEmployee(int empId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getEmployee(empId);
	}

	@Override
	public Employee addEmployee(Employee emp) throws SQLException {
		return dao.addEmployee(emp);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
