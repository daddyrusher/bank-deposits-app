package com.daddyrusher.bankdepositsapp.service;

import com.daddyrusher.bankdepositsapp.domain.Bank;
import com.daddyrusher.bankdepositsapp.repository.BaseCrudRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {
    private final BaseCrudRepository<Bank> repository;

    public BankService(@Qualifier("bankRepository") BaseCrudRepository<Bank> repository) {
        this.repository = repository;
    }

    public List<Bank> findAll() {
        return repository.findAll();
    }

    public Bank save(Bank bank) {
        return repository.save(bank);
    }

    public Optional<Bank> findById(Long id) {
        return repository.findById(id);
    }

    public Bank update(Bank bank) {
        return repository.update(bank);
    }

    public void delete(Bank bank) {
        repository.delete(bank);
    }
}
