package com.teamUnillnos.demo.controllers;

import com.teamUnillnos.demo.entities.Enterprise;
import com.teamUnillnos.demo.services.EnterpriseService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnterpriseController {

   // EnterpriseService service = new EnterpriseService();
   // Enterprise enterprise;

    //public EnterpriseController(){
        //this.enterprise = this.service.getEnterprise();
    //}

    EnterpriseService service;
    public  EnterpriseController(EnterpriseService service){
        this.service = service;
    }

    @GetMapping("/enterprises")
    public List<Enterprise> EnterpriseList(){
        return service.getEnterpriseList();
    }

    @GetMapping("/enterprises/{id}")
    public Optional<Enterprise> getEnterprise(@PathVariable long id){
        return service.getEnterprise(id);
    }

    @PostMapping("/enterprises")
    public Enterprise addEnterprise(@RequestBody Enterprise enterprise){
        return service.addEnterprise(enterprise);
    }

    @PutMapping("/enterprises/{id}")
    public Enterprise updateEnterprise(@PathVariable long id, @RequestBody Enterprise enterprise){
        return service.updateEnterprise(id, enterprise);
    }

    @DeleteMapping("/enterprises/{id}")
    public Enterprise deleteEnterprise(@PathVariable long id){
        return service.deleteEnterprise(id);
    }


}
