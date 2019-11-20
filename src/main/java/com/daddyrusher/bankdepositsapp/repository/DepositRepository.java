package com.daddyrusher.bankdepositsapp.repository;

import com.daddyrusher.bankdepositsapp.domain.Deposit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class DepositRepository implements BaseCrudRepository<Deposit> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Deposit save(Deposit deposit) {
        if (deposit.getId() == null) {
            manager.persist(deposit);
        }
        return deposit;
    }

    @Override
    public Optional<Deposit> findById(Long id) {
        return Optional.of(manager.find(Deposit.class, id));
    }

    @Override
    @Transactional
    public Deposit update(Deposit deposit) {
        return manager.merge(deposit);
    }

    @Override
    public void delete(Deposit deposit) {
        manager.remove(deposit);
    }

    @Override
    public List<Deposit> findAll() {
        return manager.createQuery("select d from Deposit").getResultList();
    }
}
