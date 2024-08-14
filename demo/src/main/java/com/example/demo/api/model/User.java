package com.example.demo.api.model;

public class User {
    
    private int id;
    private String nom;
    private String mail;

    public User(int id, String nom, String mail) {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
