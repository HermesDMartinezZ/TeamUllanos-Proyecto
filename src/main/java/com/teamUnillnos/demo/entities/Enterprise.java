package com.teamUnillnos.demo.entities;

import javax.persistence.*;

@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "adress")
    private String adress;
    @Column(name = "phone")
    private String phone;
    @Column(name = "nit")
    private long nit;

    @Transient
    Employee employee;


    //Constructor
    public Enterprise(){

    }

    public Enterprise(String name, String adress, String phone, long nit, Employee employee) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.nit = nit;
        this.employee = employee;
    }
    //Getter and setter


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", nit=" + nit +
                ", employee=" + this.employee +
                '}';
    }
}
