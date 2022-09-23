package com.teamUnillnos.demo.controllers;

import com.teamUnillnos.demo.entities.Employee;
import com.teamUnillnos.demo.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    EmployeeService service;
    public EmployeeController(EmployeeService service){
        this.service = service;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployeeList(){
        return service.getEmployeeList();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable long id){
        return service.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable long id){
        return service.updateEmployee(employee, id);
    }

    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee(@PathVariable long id){
        return service.deleteEmployee(id);
    }
}
