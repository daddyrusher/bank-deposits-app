package com.daddyrusher.bankdepositsapp.service;

import com.daddyrusher.bankdepositsapp.domain.Deposit;
import com.daddyrusher.bankdepositsapp.repository.DepositRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class DepositService implements DepositRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Deposit insert(Deposit deposit) {
        if (deposit.getId() == null) {
            manager.persist(deposit);
        }
        return deposit;
    }

    @Override
    public Deposit getById(Long id) {
        return manager.find(Deposit.class, id);
    }

    @Override
    @Transactional
    public Deposit update(Deposit deposit) {
        return null;
    }

    @Override
    @Transactional
    public Deposit delete(Deposit deposit) {
        if (manager.contains(deposit)) {
            manager.remove(deposit);
        } else {
            manager.merge(deposit);
        }
        return null;
    }

    @Override
    public List<Deposit> getAll() {
        return null;
    }
}
