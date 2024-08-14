package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.api.model.Employee;

@CrossOrigin
@RepositoryRestResource(path = "employee", collectionResourceRel = "emplo")
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

    
} 
