package com.example.mvn.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.mvn.model.Employee;
import com.example.mvn.service.EmployeeServiceImpl;
import com.example.mvn.service.IEmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IEmployeeService service=null;
		try {
			service=new EmployeeServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee emp=new Employee();
		emp.setEmpId(Integer.parseInt(request.getParameter("empId")));
		emp.setEmpName(request.getParameter("empName"));
		emp.setEmail(request.getParameter("email"));
		try {
			Employee addedEmp=service.addEmployee(emp);
			response.sendRedirect("success.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
		
		
		
		
		
	}

}
