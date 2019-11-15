package com.daddyrusher.bankdepositsapp.repository;

import com.daddyrusher.bankdepositsapp.domain.Deposit;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends BaseCrudRepository<Deposit> {}
