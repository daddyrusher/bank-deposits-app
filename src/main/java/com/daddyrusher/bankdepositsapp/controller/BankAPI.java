package com.daddyrusher.bankdepositsapp.controller;

import com.daddyrusher.bankdepositsapp.domain.Bank;
import com.daddyrusher.bankdepositsapp.service.BankService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/banks")
public class BankAPI {
    private final BankService service;

    public BankAPI(BankService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Bank>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Bank bank) {
        return ResponseEntity.ok(service.save(bank));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bank> update(@PathVariable Long id, @Valid @RequestBody Bank bank) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.update(bank));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id, @Valid @RequestBody Bank bank) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        service.delete(bank);

        return ResponseEntity.ok().build();
    }
}
