package com.daddyrusher.bankdeposits.controller

import com.daddyrusher.bankdeposits.domain.AbstractEntity
import com.daddyrusher.bankdeposits.service.CommonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity

abstract class AbstractController<E : AbstractEntity, S : CommonService<E>>
@Autowired protected constructor(protected val service: S) : CommonController<E> {

    override fun save(entity: E): ResponseEntity<E> {
        return service.save(entity).map { value -> ResponseEntity.ok().body(value) }.get()
    }

    override fun getById(id: Long): ResponseEntity<E> {
        if (service.findById(id).isPresent.not()) {
            return ResponseEntity.badRequest().build()
        }
        return ResponseEntity.ok().body(service.findById(id).get())
    }

    override fun update(id: Long, entity: E): ResponseEntity<Any> {
        if (service.findById(id).isPresent.not()) {
            return ResponseEntity.badRequest().build()
        }
        return ResponseEntity.ok().body(service.update(entity))
    }

    override fun delete(id: Long, entity: E): ResponseEntity<Any> {
        if (service.findById(id).isPresent.not()) {
            return ResponseEntity.badRequest().build()
        }
        service.delete(entity)
        return ResponseEntity.ok().build();
    }

    override fun getAll(): ResponseEntity<List<E>> { return ResponseEntity.ok().body(service.findAll()) }
}
