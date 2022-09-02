package com.teamUllanos.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {

    private String name;
    private String adress;
    private String phone;
    private long NIT;
    private List<Employee> empleados;
    private List<Transaccions> listTransaccions;


    //Constructor
    public Enterprise(String name, String adress, String phone, long NIT){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.NIT = NIT;
        empleados = new ArrayList<Employee>();
        listTransaccions = new ArrayList<Transaccions>();
    }

    //Employees Methods
    //Buscar empleados
    public Employee findEmpleado(long id){
        for (Employee empleado: empleados){
            if (empleado.getId() == id){
                return empleado;
            }
        }
        return  null;
    }

    //Agregar empleado
    public boolean addEmpleado(Employee empleado){
        if (findEmpleado(empleado.getId()) == null){
            empleados.add(empleado);
            return true;
        }

        return false;
    }

    //Eliminar empleados
    public Employee deleteEmpleado(Employee empleado){
        if (empleados.contains(empleado)){
            empleados.remove(empleado);
            return empleado;
        }

        return null;
    }

    //Actualizar empleados
    public Employee updateEmpleado(Employee empleado){
        Employee auxEmpleado = findEmpleado(empleado.getId());
        if (auxEmpleado != null){
            empleados.set( empleados.indexOf(auxEmpleado),empleado);
            return empleados.get(empleados.indexOf(empleado));
        }

        return null;
    }


    //Buscar transacciones
    public Transaccions findTransaccions(long id){
        for (Transaccions transaccions: listTransaccions){
            if (transaccions.getId() == id){
                return transaccions;
            }
        }
        return  null;
    }

    //Agregar transaccion
    public boolean addTransaccion(Transaccions transaccions){
        if (findTransaccions(transaccions.getId()) == null){
            listTransaccions.add(transaccions);
            return true;
        }

        return false;
    }

    //Eliminar transaccion
    public Transaccions deleteTransaccions(Transaccions transaccions){
        if (listTransaccions.contains(transaccions)){
            listTransaccions.remove(transaccions);
            return transaccions;
        }

        return null;
    }

    //toString


    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", NIT=" + NIT +
                ", empleados=" + empleados +
                ", listTransaccions=" + listTransaccions +
                '}';
    }

    //Getters and Setters
    public List<Transaccions> getTransaccions() {
        return listTransaccions;
    }

    public void setTransaccions(List<Transaccions> transaccions) {
        this.listTransaccions = transaccions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }

    public List<Employee> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Employee> empleados) {
        this.empleados = empleados;
    }
}
