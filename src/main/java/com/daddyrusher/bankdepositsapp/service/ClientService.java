package com.daddyrusher.bankdepositsapp.service;

import com.daddyrusher.bankdepositsapp.domain.Client;
import com.daddyrusher.bankdepositsapp.repository.BaseCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private BaseCrudRepository<Client> repository;

    @Autowired
    public ClientService(@Qualifier("clientRepository") BaseCrudRepository<Client> repository) {
        this.repository = repository;
    }

    public ClientService() {
    }

    public List<Client> findAll() {
        return repository.findAll();
    }

    public Client save(Client client) {
        return repository.save(client);
    }

    public Optional<Client> findById(Long id) {
        return repository.findById(id);
    }

    public Client update(Client client) {
        return repository.update(client);
    }

    public void delete(Client client) {
        repository.delete(client);
    }

}
