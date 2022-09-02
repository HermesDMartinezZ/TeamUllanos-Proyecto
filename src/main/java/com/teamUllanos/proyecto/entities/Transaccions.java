package com.teamUllanos.proyecto.entities;

public class Transaccions {
    private long id;
    private float amount;
    private String concept;
    private Employee employee;


    //Constructors
    public Transaccions(){

    }

    public Transaccions(long id, float amount, String concept, Employee employee){
        this.id = id;
        this.amount = amount;
        this.concept = concept;
        this.employee = employee;
    }


    //Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
