package com.daddyrusher.bankdeposits.service

import com.daddyrusher.bankdeposits.domain.AbstractEntity
import com.daddyrusher.bankdeposits.repository.CommonRepository
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

abstract class AbstractService<E : AbstractEntity, R : CommonRepository<E>> @Autowired constructor(val repository: R) : CommonService<E> {
    override fun save(entity: E): Optional<E> = Optional.of(repository.save(entity))

    override fun findById(id: Long): Optional<E> = repository.findById(id)

    override fun delete(entity: E) { repository.delete(entity) }

    /*override fun update(entity: E): Optional<E> = Optional.of(repository.update(entity))*/

    override fun findAll(): List<E> { return repository.findAll().toList() }
}
