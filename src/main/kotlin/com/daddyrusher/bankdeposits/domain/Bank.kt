package com.daddyrusher.bankdeposits.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "banks")
class Bank : AbstractEntity() {

    @Column(name = "name")
    @NotBlank
    private val name: String = ""

    @Column(name = "bik")
    @NotBlank
    private val bik: Long = 0
}
