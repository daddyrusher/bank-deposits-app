package com.daddyrusher.bankdeposits.controller;

import com.daddyrusher.bankdeposits.domain.Bank;
import com.daddyrusher.bankdeposits.service.BankService
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/banks")
class BankAPI(service: BankService): AbstractController<Bank, BankService>(service)
