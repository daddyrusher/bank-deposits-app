package com.daddyrusher.bankdeposits.repository

import com.daddyrusher.bankdeposits.domain.Deposit
import org.springframework.stereotype.Repository

@Repository
interface DepositRepository : CommonRepository<Deposit>
