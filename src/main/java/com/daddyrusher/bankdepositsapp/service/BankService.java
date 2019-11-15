package com.daddyrusher.bankdepositsapp.service;

import com.daddyrusher.bankdepositsapp.domain.Bank;
import com.daddyrusher.bankdepositsapp.repository.BankRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class BankService implements BankRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Bank insert(Bank bank) {
        if (bank.getId() == null) {
            manager.persist(bank);
        }
        return bank;
    }

    @Override
    public Bank getById(Long id) {
        return manager.find(Bank.class, id);
    }

    @Override
    @Transactional
    public Bank update(Bank entity) {
        return null;
    }

    @Override
    public Bank delete(Bank bank) {
        if (manager.contains(bank)) {
            manager.remove(bank);
        } else {
            manager.merge(bank);
        }
        return null;
    }

    @Override
    public List<Bank> getAll() {
        return null;
    }
}
