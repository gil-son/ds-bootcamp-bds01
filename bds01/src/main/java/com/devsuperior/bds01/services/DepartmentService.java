package com.devsuperior.bds01.services;

import com.devsuperior.bds01.repositories.DepartmentRepository;

public class DepartmentService {

	private DepartmentRepository departmentRepository;

	
	DepartmentService(DepartmentRepository departmentRepository){
		this.departmentRepository = departmentRepository;
	}
	
}
