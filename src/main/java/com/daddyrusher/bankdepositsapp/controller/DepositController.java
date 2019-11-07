package com.daddyrusher.bankdepositsapp.controller;

import com.daddyrusher.bankdepositsapp.repository.DepositRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {
    private final DepositRepository repository;

    public DepositController(DepositRepository repository) {
        this.repository = repository;
    }
}
