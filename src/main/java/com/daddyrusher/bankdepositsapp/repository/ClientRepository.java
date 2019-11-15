package com.daddyrusher.bankdepositsapp.repository;

import com.daddyrusher.bankdepositsapp.domain.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends BaseCrudRepository<Client> {}
