package com.sony;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("addEmployee")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("index");
		}
		dao.save(employee);
		
		ModelAndView mv=new ModelAndView();
		System.out.println(employee);
		
		mv.addObject("emp",employee);
		mv.setViewName("empDetails");
		
		return mv;
	}
	
	@RequestMapping("getEmployee")
	@ResponseBody
	public List<Employee> getEmployee(int epoints)
	{
		List<Employee> emp=dao.findByEpoints(epoints);
		return emp;	
	}

}
