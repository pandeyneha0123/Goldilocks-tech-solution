package com.Use;

import java.util.List;

import com.entity.Emp;
import com.model.EmpModel;

public class details {

	public static void main(String[] args) {
		
		EmpModel stp=new EmpModel();
		
		
		List<Emp> r=stp.getAllDetails();
		
		
		System.out.println(r);

	}

}