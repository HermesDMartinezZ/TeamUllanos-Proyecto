package com.teamUllanos.proyecto.entities;

import java.time.LocalDate;

public class MovimientoDinero {
    private long id;
    private double monto;
    private String concepto;
    private LocalDate fecha;
    private Empleado usuario;
    private Empresa empresa;

    //Constructor
    public MovimientoDinero(long id, double monto, String concepto, LocalDate fecha, Empleado usuario, Empresa empresa){
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.fecha = fecha;
        this.usuario = usuario;
        this.empresa = empresa;
    }

    //Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
