package com.devsuperior.bds01.services;

import org.springframework.stereotype.Service;

import com.devsuperior.bds01.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	
	EmployeeService(EmployeeRepository employeeRepository){
		this.employeeRepository = employeeRepository;
	}
	
}
