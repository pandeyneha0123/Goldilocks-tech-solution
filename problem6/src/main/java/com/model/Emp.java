package com.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String eName;
	
	private Integer eAge;

	public Emp() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEName() {
		return eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	public Integer getEAge() {
		return eAge;
	}

	public void setEmpAge(Integer eAge) {
		this.eAge = eAge;
	}
	
	
	
}