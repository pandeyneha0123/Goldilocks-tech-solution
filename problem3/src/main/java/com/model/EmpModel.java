package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Emp;
import com.util.EmpUtil;



public class EmpModel {
	
	public List<Emp> getAllDetails(){
		List<Emp> xyz=new ArrayList<>();
		
		try (Connection cntn=EmpUtil.provideConnection()){
			
			PreparedStatement x=cntn.prepareStatement("select * from Test");
			
			ResultSet xy=x.executeQuery();
			
			while(xy.next()) {
				xyz.add(new Emp(xy.getString("name"),xy.getInt("age")));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return xyz;
	}

}
