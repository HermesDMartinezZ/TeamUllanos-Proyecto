package com.teamUnillnos.demo.controllers;

import com.teamUnillnos.demo.entities.Transaction;
import com.teamUnillnos.demo.services.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransactionController {
    TransactionService service;

    public TransactionController(TransactionService service){
        this.service = service;
    }

    @GetMapping("/movements")
    public List<Transaction> getTransactionList(){
        return service.getTransactionList();
    }

    @GetMapping("/movements/{id}")
    public Optional<Transaction> getTransaction(@PathVariable long id){
        return service.getTransaction(id);
    }

    @PostMapping("/movements")
    public Transaction addTransaction(@RequestBody Transaction transaction){
        return service.addTransaction(transaction);
    }

    @DeleteMapping("/movements/{id}")
    public Transaction deleteTransaction(@PathVariable long id){
        return service.deleteTransaction(id);
    }

    @PutMapping("/movements/{id}")
    public Transaction updateTransaction(@RequestBody Transaction transaction, @PathVariable  long id){
        return service.updateTransaction(transaction, id);
    }
}
