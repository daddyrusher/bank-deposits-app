package com.daddyrusher.bankdeposits.domain

import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class AbstractEntity {
    @Id
    @GeneratedValue
    val id: Long = 0
}
