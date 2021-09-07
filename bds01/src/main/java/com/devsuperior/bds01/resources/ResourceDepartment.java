package com.devsuperior.bds01.resources;

import org.springframework.stereotype.Controller;

import com.devsuperior.bds01.services.DepartmentService;

@Controller
public class ResourceDepartment {
	
	
	private DepartmentService departmentService;
	
	ResourceDepartment(DepartmentService departmentService){
		
		this.departmentService = departmentService;
	}

}
