package com.springboot.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.healthcare.model.Test;
import com.springboot.healthcare.repository.TestRepository;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/k1")
public class TestController {
	
	@Autowired
	private TestRepository testrepository;
	
	//Get all tests
	@GetMapping("tests")
	public List<Test> getAllTests(){
		return testrepository.findAll();
	}
		
	

}
