package com.teamUllanos.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private long id;
    private String name;
    private String email;
    private Enterprise enterprise;
    private RoleName roleName;
    private List<Transaccions> listTransaccions;


    //constructor
    public Employee(){}
    public Employee(long id, String name, String email, Enterprise enterprise, RoleName roleName){
        this.id = id;
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.roleName = roleName;
        listTransaccions = new ArrayList<Transaccions>();
    }

    //Methods transaccions

    //Obtener transacciones
    public ArrayList<Transaccions> getAllTransaccions(){
        return (ArrayList<Transaccions>) listTransaccions;
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
            listTransaccions.add(transaccions); //Agrega transaccion al registro de transacciones del empleado
            return true;
        }

        return false;
    }

    //Eliminar transaccion
    public Transaccions deleteTransaccions(Transaccions transaccions){
        if (listTransaccions.contains(transaccions)){
            listTransaccions.remove(transaccions); //Elimina transaccion del registro de transacciones del empleado
            return transaccions;
        }

        return null;
    }


    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", enterprise=" + enterprise +
                ", roleName=" + roleName +
                ", listTransaccions=" + listTransaccions +
                '}';
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
