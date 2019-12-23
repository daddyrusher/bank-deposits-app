package com.daddyrusher.bankdeposits.service

import com.daddyrusher.bankdeposits.domain.Bank
import org.springframework.stereotype.Service

@Service
class BankService : AbstractJpaService<Bank>()
