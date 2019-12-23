package com.daddyrusher.bankdeposits.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "clients")
class Client : AbstractEntity() {

    @Column
    @NotBlank
    private val name: String = ""

    @Column
    @NotBlank
    private val shortName: String = ""

    @NotBlank
    @Column
    private val address: String = ""

    @Column
    @NotBlank
    private val rulesForm: String = ""
}
