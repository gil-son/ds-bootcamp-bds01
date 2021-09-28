package com.devsuperior.bds01.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {


	
	private final DepartmentService service;
	
	DepartmentController(DepartmentService service){
		this.service = service;
	}
	
	
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll(){
		
		List<DepartmentDTO> listDTO = service.findAll();
		return ResponseEntity.ok().body(listDTO);
	}
}