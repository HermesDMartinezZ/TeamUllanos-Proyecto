package com.teamUnillnos.demo.entities;

import javax.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "amount")
    private float amount;
    @Column(name = "concept")
    private String concept;


    //Constructor
    public Transaction(){

    }

    public Transaction(float amount, String concept) {
        this.amount = amount;
        this.concept = concept;
    }

    //Getters and setters

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
}
