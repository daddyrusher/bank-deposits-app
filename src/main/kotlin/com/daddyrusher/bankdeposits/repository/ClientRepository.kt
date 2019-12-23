package com.daddyrusher.bankdeposits.repository

import com.daddyrusher.bankdeposits.domain.Client
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : CommonRepository<Client>
