package com.devsuperior.bds01.resources;


import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds01.services.EmployeeService;


@RestController
public class EmployeeResource {

	
	private EmployeeService employeeService;
	
	EmployeeResource(EmployeeService employeeService){
		
		this.employeeService = employeeService;
	}
	
	
}
