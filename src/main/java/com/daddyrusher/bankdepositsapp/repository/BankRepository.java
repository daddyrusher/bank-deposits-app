package com.daddyrusher.bankdepositsapp.repository;

import com.daddyrusher.bankdepositsapp.domain.Bank;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class BankRepository implements BaseCrudRepository<Bank> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Bank save(Bank bank) {
        if (bank.getId() == null) {
            manager.persist(bank);
        }
        return bank;
    }

    @Override
    public Optional<Bank> findById(Long id) {
        return Optional.of(manager.find(Bank.class, id));
    }

    @Override
    @Transactional
    public void delete(Bank bank) {
        manager.remove(bank);
    }

    @Override
    @Transactional
    public Bank update(Bank bank) {
        return manager.merge(bank);
    }

    @Override
    public List<Bank> findAll() {
        return manager.createQuery("select b from Bank").getResultList();
    }
}
