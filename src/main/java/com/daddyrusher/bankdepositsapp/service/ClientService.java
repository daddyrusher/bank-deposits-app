package com.daddyrusher.bankdepositsapp.service;

import com.daddyrusher.bankdepositsapp.domain.Client;
import com.daddyrusher.bankdepositsapp.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ClientService implements ClientRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Client insert(Client client) {
        if (client.getId() == null) {
            manager.persist(client);
        }
        return client;
    }

    @Override
    public Client getById(Long id) {
        return manager.find(Client.class, id);
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public Client delete(Client client) {
        if (manager.contains(client)) {
            manager.remove(client);
        } else {
            manager.merge(client);
        }
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }
}
