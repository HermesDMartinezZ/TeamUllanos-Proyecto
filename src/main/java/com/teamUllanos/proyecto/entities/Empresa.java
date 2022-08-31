package com.teamUllanos.proyecto.entities;

import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private long NIT;
    private List<Empleado> empleados;
    private List<MovimientoDinero> transacciones;

    //Constructor
    public Empresa(String nombre, String direccion, String telefono, long NIT, List<Empleado> empleados, List<MovimientoDinero> transacciones){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
        this.empleados = empleados;
        this.transacciones = transacciones;
    }

    //Methods
    public void addEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void removeEmpleado(Empleado empleado){
        for (int i=0; i<empleados.size(); i++){
            if (empleados.get(i).getId() == empleado.getId()){
                empleados.remove(i);
            }
        }
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<MovimientoDinero> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<MovimientoDinero> transacciones) {
        this.transacciones = transacciones;
    }
}
