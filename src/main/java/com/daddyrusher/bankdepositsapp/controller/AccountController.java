package com.daddyrusher.bankdepositsapp.controller;

import com.daddyrusher.bankdepositsapp.domain.Account;
import com.daddyrusher.bankdepositsapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    private final AccountRepository repository;

    @Autowired
    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Account> getAll() {
        return repository.getAll();
    }

    @GetMapping
    public void getAccount(@PathVariable long id) {
        repository.getById(id);
    }
    @PostMapping
    public void createAccount(@RequestBody Account account) {
        repository.insert(account);
    }

    @DeleteMapping
    public void deleteAccount(@RequestParam long id) {
        repository.delete(id);
    }

    @PutMapping
    public void updateAccount(Account account) {
        repository.update(account);
    }

}
