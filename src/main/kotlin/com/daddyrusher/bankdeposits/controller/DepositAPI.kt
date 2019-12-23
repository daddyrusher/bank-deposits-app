package com.daddyrusher.bankdeposits.controller;

import com.daddyrusher.bankdeposits.domain.Deposit;
import com.daddyrusher.bankdeposits.service.DepositService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/deposits")
class DepositAPI(service: DepositService): AbstractController<Deposit, DepositService>(service)
