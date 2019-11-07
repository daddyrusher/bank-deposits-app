package com.daddyrusher.bankdepositsapp.controller;

import com.daddyrusher.bankdepositsapp.repository.BankRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    private final BankRepository repository;

    public BankController(BankRepository repository) {
        this.repository = repository;
    }
}
