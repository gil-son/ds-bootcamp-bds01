package com.devsuperior.bds01.services;

import com.devsuperior.bds01.repositories.EmployeeRepository;

public class EmployeeService {

	private EmployeeRepository employeeRepository;

	
	EmployeeService(EmployeeRepository employeeRepository){
		this.employeeRepository = employeeRepository;
	}
	
}
