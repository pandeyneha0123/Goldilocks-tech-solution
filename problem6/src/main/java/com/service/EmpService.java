package com.service;

import java.util.List;

import com.model.Emp;
import com.exception.EmpNotFoundException;

public interface EmpService {
	
	public List<Emp> getAllEmp() throws EmpNotFoundException;

}