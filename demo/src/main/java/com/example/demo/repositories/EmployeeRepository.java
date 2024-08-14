package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.api.model.Employee;

@CrossOrigin
@RestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    
} 
