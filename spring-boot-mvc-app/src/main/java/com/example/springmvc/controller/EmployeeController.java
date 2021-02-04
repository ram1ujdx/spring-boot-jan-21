package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.Employee;

@Controller
public class EmployeeController {

//	@RequestMapping("/show-employee")
//	public ModelAndView showEmployeeData() {
//		
//		Employee emp=new Employee(1001, "Rahul", "rahul@yahho.com");
//		
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("emp", emp);
//		mv.setViewName("show.jsp");
//		
//		return mv;
//	}
	
//	@RequestMapping("/show-employee")
//	public String showEmployeeData(Model model, @RequestParam("employeeId") int employeeId,
//												@RequestParam String employeeName, 
//												@RequestParam String email) {
//		Employee emp=new Employee(employeeId, employeeName,email);
//		model.addAttribute("emp", emp);
//		return "show";
//	}
//	
	
//	@RequestMapping(value = "/show-employee", method = RequestMethod.POST)
	@PostMapping("/show-employee")
	public String showEmployeeData(@ModelAttribute("emp") Employee emp) {
		return "show";
	}
	
	
	
}
