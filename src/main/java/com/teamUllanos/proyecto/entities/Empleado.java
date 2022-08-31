package com.teamUllanos.proyecto.entities;

import java.util.List;

public class Empleado {
    private long id;
    private String name;
    private String email;
    private RoleName rol;
    private Empresa empresa;
    private List<MovimientoDinero> transacciones;

    //Constructor
    public Empleado(long id, String name, String email, RoleName rol, Empresa empresa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.rol = rol;
        this.empresa = empresa;
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

    public RoleName getRol() {
        return rol;
    }

    public void setRol(RoleName rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<MovimientoDinero> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<MovimientoDinero> transacciones) {
        this.transacciones = transacciones;
    }
}
