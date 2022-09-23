package com.teamUnillnos.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
    @Column(name = "rol")
    private String rol;
    @Column(name = "nit")
    private  long nit;

    @Transient
    Transaction transaction;

    @Transient
    Enterprise enterprise;

    //Constructors
    public Employee(){

    }

    public Employee(String name, String email, String phone, String rol, long nit, Transaction transaction) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.rol = rol;
        this.nit = nit;
        this.transaction = transaction;
    }

    public Employee(String name, String email, String phone,String rol, long nit, Transaction transaction, Enterprise enterprise) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.rol = rol;
        this.nit = nit;
        this.transaction = transaction;
        this.enterprise = enterprise;
    }

    //Getters and setters

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", rol=" + rol +
                ", nit=" + nit +
                ", transaction=" + this.transaction +
                '}';
    }
}
