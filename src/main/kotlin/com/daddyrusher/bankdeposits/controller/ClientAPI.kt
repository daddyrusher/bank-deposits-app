package com.daddyrusher.bankdeposits.controller;

import com.daddyrusher.bankdeposits.domain.Client;
import com.daddyrusher.bankdeposits.service.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clients")
class ClientAPI(service: ClientService): AbstractController<Client, ClientService>(service)

