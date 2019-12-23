package com.daddyrusher.bankdeposits.service

import com.daddyrusher.bankdeposits.domain.AbstractEntity
import java.util.*

interface CommonService<E : AbstractEntity> {
    fun save(entity: E): Optional<E>
    fun saveAll(entities: List<E>): List<E>
    fun update(entity: E): Optional<E>
    fun findAll(): List<E>
    fun delete(entity: E)
    fun deleteAll()
    fun findById(id: Long): Optional<E>
}
