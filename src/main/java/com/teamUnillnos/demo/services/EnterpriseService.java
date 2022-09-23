package com.teamUnillnos.demo.services;

import com.teamUnillnos.demo.entities.Enterprise;
import com.teamUnillnos.demo.repositories.EnterpriseRepositorie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {
    //Enterprise enterprise;
    //EmployeeService employeeService = new EmployeeService();

    private EnterpriseRepositorie repository;

    public EnterpriseService(EnterpriseRepositorie repository){
       // Employee employee = this.employeeService.getEmployee();
       // this.enterprise = new Enterprise("Apple", "Villavicencio Meta", "301456872", 12364789, employee);
        this.repository = repository;
    }

    public List<Enterprise> getEnterpriseList(){
        return repository.findAll();
        //return this.enterprise;
    }

    public Optional<Enterprise> getEnterprise(long id){
        return repository.findById(id);
    }

    public Enterprise addEnterprise(Enterprise enterprise){
        return repository.save(enterprise);
    }

    public Enterprise updateEnterprise(long id, Enterprise enterprise){
        Enterprise currentEnterprise = repository.findById(id).orElseThrow();
        currentEnterprise.setName(enterprise.getName());
        currentEnterprise.setAdress(enterprise.getAdress());
        currentEnterprise.setNit(enterprise.getNit());
        currentEnterprise.setPhone(enterprise.getPhone());
        return repository.save(currentEnterprise);
    }

    public Enterprise deleteEnterprise(long id){
        Enterprise currentEnterprise = repository.findById(id).orElseThrow();
        repository.deleteById(id);
        return currentEnterprise;
    }

}
