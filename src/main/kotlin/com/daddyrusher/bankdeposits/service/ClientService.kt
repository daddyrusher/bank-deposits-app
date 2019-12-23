package com.daddyrusher.bankdeposits.service

import com.daddyrusher.bankdeposits.domain.Client
import org.springframework.stereotype.Service

@Service
class ClientService: AbstractJpaService<Client>()
