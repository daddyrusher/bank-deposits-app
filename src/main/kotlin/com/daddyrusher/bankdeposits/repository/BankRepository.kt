package com.daddyrusher.bankdeposits.repository

import com.daddyrusher.bankdeposits.domain.Bank
import org.springframework.stereotype.Repository

@Repository
interface BankRepository : CommonRepository<Bank>
