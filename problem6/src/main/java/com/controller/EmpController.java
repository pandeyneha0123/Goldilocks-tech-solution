package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Emp;
import com.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
    private EmpService empService;

    @GetMapping("/Emp")
    public ResponseEntity<List<Emp>> getAllEmployeeHandler(){
        List<Emp> lst = empService.getAllEmp();
        return new ResponseEntity<>(lst, HttpStatus.OK);
    }
}