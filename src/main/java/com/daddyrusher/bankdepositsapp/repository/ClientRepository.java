package com.daddyrusher.bankdepositsapp.repository;

import com.daddyrusher.bankdepositsapp.domain.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ClientRepository implements BaseCrudRepository<Client> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Client save(Client client) {
        if (client.getId() == null) {
            manager.persist(client);
        }
        return client;
    }

    @Override
    public Optional<Client> findById(Long id) {
        return Optional.of(manager.find(Client.class, id));
    }

    @Override
    public void delete(Client client) {
        manager.remove(client);
    }

    @Override
    public Client update(Client client) {
        return manager.merge(client);
    }

    @Override
    public List<Client> findAll() {
        return manager.createQuery("SELECT c FROM Client c ORDER BY c.name", Client.class).getResultList();
    }
}
