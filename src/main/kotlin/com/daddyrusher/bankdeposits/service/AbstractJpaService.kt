package com.daddyrusher.bankdeposits.service

import com.daddyrusher.bankdeposits.domain.AbstractEntity
import org.springframework.transaction.annotation.Transactional
import java.util.*
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.persistence.TypedQuery
import javax.persistence.criteria.*

abstract class AbstractJpaService<E : AbstractEntity> : CommonService<E> {
    @PersistenceContext
    private lateinit var manager: EntityManager

    private val criteriaBuilder: CriteriaBuilder = manager.criteriaBuilder

    private val entityClass: Class<E>? = null

    @Transactional
    override fun save(entity: E): Optional<E> {
        if (entity.id == null) {
            manager.persist(entity)
            return Optional.of(entity)
        }
        return Optional.of(manager.merge(entity))
    }

    @Transactional
    override fun saveAll(entities: List<E>): List<E> {
        entities.forEach {entity -> manager.persist(entity) }
        return entities
    }

    override fun update(entity: E): Optional<E> = Optional.of(manager.merge(entity))

    @Transactional
    override fun findAll(): List<E> {
        val criteriaQuery: CriteriaQuery<E> = criteriaBuilder.createQuery(entityClass)
        val rootEntry: Root<E> = criteriaQuery.from(entityClass)
        val all: CriteriaQuery<E> = criteriaQuery.select(rootEntry)
        val allQuery: TypedQuery<E> = manager.createQuery(all)
        return allQuery.resultList
    }

    @Transactional
    override fun delete(entity: E) { manager.remove(entity) }

    override fun findById(id: Long): Optional<E> = Optional.of(manager.find(entityClass, id))

    @Transactional
    override fun deleteAll() {
        val criteriaDelete: CriteriaUpdate<E>? = criteriaBuilder.createCriteriaUpdate(entityClass)
        criteriaDelete?.from(entityClass)
    }
}
