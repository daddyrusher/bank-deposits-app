package com.daddyrusher.bankdepositsapp.repository;

import java.util.List;
import java.util.Optional;

public interface BaseCrudRepository<T> {
    T save(T entity);
    Optional<T> findById(Long id);
    void delete(T entity);
    T update(T entity);
    List<T> findAll();
}
