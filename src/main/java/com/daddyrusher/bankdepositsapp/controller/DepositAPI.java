package com.daddyrusher.bankdepositsapp.controller;

import com.daddyrusher.bankdepositsapp.domain.Client;
import com.daddyrusher.bankdepositsapp.domain.Deposit;
import com.daddyrusher.bankdepositsapp.service.DepositService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/deposits")
public class DepositAPI {
    private final DepositService service;

    public DepositAPI(DepositService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Deposit>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Deposit deposit) {
        return ResponseEntity.ok(service.save(deposit));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Deposit> update(@PathVariable Long id, @Valid @RequestBody Deposit deposit) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.update(deposit));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id, @Valid @RequestBody Deposit deposit) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        service.delete(deposit);

        return ResponseEntity.ok().build();
    }
}
