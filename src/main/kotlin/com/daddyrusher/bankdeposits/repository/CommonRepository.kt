package com.daddyrusher.bankdeposits.repository;

import com.daddyrusher.bankdeposits.domain.AbstractEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface CommonRepository<E : AbstractEntity> : CrudRepository<E, Long>
