package com.devsuperior.bds01.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds01.dto.EmployeeDTO;
import com.devsuperior.bds01.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {


	
	private final EmployeeService service;
	
	EmployeeController(EmployeeService service){
		this.service = service;
	}
	
	
	@GetMapping
	public ResponseEntity<Page<EmployeeDTO>> findAll(Pageable pageable){
		PageRequest pageRequest = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("name"));
		Page<EmployeeDTO> pageDTO = service.findAll(pageRequest);
		return ResponseEntity.ok().body(pageDTO);
	}
}