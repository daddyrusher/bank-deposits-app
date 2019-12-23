package com.daddyrusher.bankdeposits.service

import com.daddyrusher.bankdeposits.domain.Deposit
import org.springframework.stereotype.Service

@Service
class DepositService: AbstractJpaService<Deposit>()
