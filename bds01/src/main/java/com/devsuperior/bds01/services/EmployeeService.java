package com.devsuperior.bds01.services;


import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.devsuperior.bds01.dto.EmployeeDTO;
import com.devsuperior.bds01.entities.Employee;
import com.devsuperior.bds01.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository repository;

	
	EmployeeService(EmployeeRepository repository){
		this.repository = repository;
	}

	
	
	public Page<EmployeeDTO> findAll(Pageable pegeable){
		Page<Employee> page = repository.findAll(pegeable);
		
		return page.map(x -> new EmployeeDTO(x));
	}
}
