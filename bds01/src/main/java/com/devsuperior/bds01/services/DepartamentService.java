package com.devsuperior.bds01.services;

import com.devsuperior.bds01.repositories.DepartmentRepository;

public class DepartamentService {

	private DepartmentRepository departmentRepository;

	
	DepartamentService(DepartmentRepository departmentRepository){
		this.departmentRepository = departmentRepository;
	}
	
}
