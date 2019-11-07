package com.daddyrusher.bankdepositsapp.repository;

import com.daddyrusher.bankdepositsapp.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository {
    Account insert(Account account);
    Account getById(Long id);
    Account update(Account account);
    Account delete(long id);
    List<Account> getAll();
}
