package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Emp;
import com.exception.EmpNotFoundException;
import com.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpRepo emR;
	
	public List<Emp> getAllEmployee() throws EmpNotFoundException{
		List<Emp> eps = emR.findAll();
		
		if(eps.isEmpty()) {
			throw new EmpNotFoundException("Emp is not available in db");
		}
		
		return eps;
	}

	@Override
	public List<Emp> getAllEmp() throws EmpNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
}