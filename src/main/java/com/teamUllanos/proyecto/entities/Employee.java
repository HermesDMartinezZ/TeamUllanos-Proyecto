package com.teamUllanos.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private long id;
    private String name;
    private String email;
    private Enterprise enterprise;
    private RoleName roleName;



    //constructor
    public Employee(){}
    public Employee(long id, String name, String email, Enterprise enterprise, RoleName roleName){
        this.id = id;
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.roleName = roleName;

    }


    //Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }

}
