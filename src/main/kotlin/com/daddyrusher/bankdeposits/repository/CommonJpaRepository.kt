package com.daddyrusher.bankdeposits.repository

import com.daddyrusher.bankdeposits.domain.AbstractEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface CommonJpaRepository<E : AbstractEntity> : JpaRepository<E, Long>
