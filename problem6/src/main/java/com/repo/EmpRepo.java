package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer>  {

}