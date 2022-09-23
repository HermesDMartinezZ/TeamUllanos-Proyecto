package com.teamUnillnos.demo.services;

import com.teamUnillnos.demo.entities.Transaction;
import com.teamUnillnos.demo.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    TransactionRepository repository;

    public TransactionService(TransactionRepository repository){
        this.repository = repository;
    }

    public List<Transaction> getTransactionList(){
        return repository.findAll();
    }

    public Optional<Transaction> getTransaction(long id){
        return repository.findById(id);
    }

    public Transaction addTransaction(Transaction transaction){
        return repository.save(transaction);
    }

    public Transaction deleteTransaction(long id){
        Transaction currentTransaction = repository.findById(id).orElseThrow();
        repository.deleteById(id);
        return currentTransaction;
    }

    public Transaction updateTransaction(Transaction transaction, long id){
        Transaction currentTransaction = repository.findById(id).orElseThrow();
        currentTransaction.setAmount(transaction.getAmount());
        currentTransaction.setConcept(transaction.getConcept());
        return repository.save(currentTransaction);
    }
}
