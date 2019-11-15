package com.daddyrusher.bankdepositsapp.controller;

import com.daddyrusher.bankdepositsapp.domain.Client;
import com.daddyrusher.bankdepositsapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    private final ClientRepository repository;

    @Autowired
    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Client> getAll() {
        return repository.getAll();
    }

    @GetMapping
    public void getAccount(@PathVariable long id) {
        repository.getById(id);
    }
    @PostMapping
    public void createAccount(@RequestBody Client client) {
        repository.insert(client);
    }

    @DeleteMapping
    public void deleteAccount(@RequestParam Client client) {
        repository.delete(client);
    }

    @PutMapping
    public void updateAccount(Client client) {
        repository.update(client);
    }

}
