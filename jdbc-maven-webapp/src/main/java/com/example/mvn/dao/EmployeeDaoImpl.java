package com.example.mvn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.mvn.model.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {

	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rst=null;
	public EmployeeDaoImpl() throws SQLException {
		con=DbUtil.getConnection();
	}
	
	

	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee emp) throws SQLException{
		pst=con.prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1, emp.getEmpId());
		pst.setString(2, emp.getEmpName());
		pst.setString(3, emp.getEmail());
		int rowsUpdated=pst.executeUpdate();
		if(rowsUpdated>0) {
			return emp;
		}
		return null;
	}


	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}



	

}
