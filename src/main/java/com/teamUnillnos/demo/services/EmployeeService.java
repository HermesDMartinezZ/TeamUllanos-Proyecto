package com.teamUnillnos.demo.services;

import com.teamUnillnos.demo.entities.Employee;
import com.teamUnillnos.demo.entities.Enterprise;
import com.teamUnillnos.demo.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository){
        this.repository = repository;
    }

    public List<Employee> getEmployeeList(){
        return repository.findAll();
    }

    public Optional<Employee> getEmployee(long id){
        return repository.findById(id);
    }

    public Employee addEmployee(Employee employee){
        return repository.save(employee);
    }

    public Employee updateEmployee(Employee employee, long id){
        Employee currentEmployee = repository.findById(id).orElseThrow();
        currentEmployee.setName(employee.getName());
        currentEmployee.setPhone(employee.getPhone());
        currentEmployee.setNit(employee.getNit());
        currentEmployee.setEmail(employee.getEmail());
        currentEmployee.setRol(employee.getRol());
        return repository.save(currentEmployee);
    }

    public Employee deleteEmployee(long id){
        Employee currentEmployee = repository.findById(id).orElseThrow();
        repository.deleteById(id);
        return currentEmployee;
    }

}
