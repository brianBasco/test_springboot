package com.example.demo.api.model;

import jakarta.persistence.*;

@Entity
public class Employee {
    
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
  
    private String nom;

    public Employee() {
    }

    public Employee(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Employee(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
   
    
}
