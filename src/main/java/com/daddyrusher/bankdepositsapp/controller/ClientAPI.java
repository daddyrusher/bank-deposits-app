package com.daddyrusher.bankdepositsapp.controller;

import com.daddyrusher.bankdepositsapp.domain.Client;
import com.daddyrusher.bankdepositsapp.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientAPI {
    private final ClientService service;

    public ClientAPI(ClientService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Client client) {
        return ResponseEntity.ok(service.save(client));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long id, @Valid @RequestBody Client client) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.update(client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id, @Valid @RequestBody Client client) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        service.delete(client);

        return ResponseEntity.ok().build();
    }
}
