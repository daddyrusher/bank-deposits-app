package com.daddyrusher.bankdepositsapp.service;

import com.daddyrusher.bankdepositsapp.domain.Deposit;
import com.daddyrusher.bankdepositsapp.repository.BaseCrudRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepositService {
    private final BaseCrudRepository<Deposit> repository;

    public DepositService(@Qualifier("depositRepository") BaseCrudRepository<Deposit> repository) {
        this.repository = repository;
    }

    public List<Deposit> findAll() {
        return repository.findAll();
    }

    public Deposit save(Deposit deposit) {
        return repository.save(deposit);
    }

    public Optional<Deposit> findById(Long id) {
        return repository.findById(id);
    }

    public Deposit update(Deposit deposit) {
        return repository.update(deposit);
    }

    public void delete(Deposit deposit) {
        repository.delete(deposit);
    }

}
