package com.example.restservice;

import javax.persistence.Entity;
import javax.persistence.Id;

//Entity是保证这个object写进database
@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
