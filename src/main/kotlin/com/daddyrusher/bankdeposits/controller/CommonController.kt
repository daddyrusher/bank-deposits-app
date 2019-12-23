package com.daddyrusher.bankdeposits.controller

import com.daddyrusher.bankdeposits.domain.AbstractEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

interface CommonController<E : AbstractEntity> {

    @PostMapping
    fun save(@Valid @RequestBody entity: E) : ResponseEntity<E>

    @GetMapping("/id")
    fun getById(@PathVariable id: Long) : ResponseEntity<E>

    @DeleteMapping()
    fun delete(@PathVariable id: Long, @Valid @RequestBody entity: E) : ResponseEntity<Any>

    @GetMapping
    fun getAll() : ResponseEntity<List<E>>

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @Valid @RequestBody entity: E) : ResponseEntity<Any>
}
