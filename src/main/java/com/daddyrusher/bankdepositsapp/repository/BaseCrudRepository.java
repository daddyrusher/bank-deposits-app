package com.daddyrusher.bankdepositsapp.repository;

import java.util.List;

public interface BaseCrudRepository<T> {
    T insert(T entity);
    T getById(Long id);
    T update(T entity);
    T delete(T entity);
    List<T> getAll();
}
