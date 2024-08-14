package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.api.model.User;

@CrossOrigin
@RepositoryRestResource(path="userss")
public interface UserRepository extends CrudRepository<User,Long> {

    
} 
