package com.daddyrusher.bankdeposits.domain;

import java.time.LocalDateTime
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "deposits")
class Deposit : AbstractEntity() {
    @ManyToOne
    @JoinColumn(name = "client_id")
    @NotBlank
    private val client: Client = Client()

    @ManyToOne
    @JoinColumn(name = "bank_id")
    @NotBlank
    private val bank: Bank = Bank()

    @Column(name = "start_date")
    @NotBlank
    private val startDate: LocalDateTime? = null

    @Column(name = "percent")
    @NotBlank
    private val percent: Double = 0.0

    @Column(name = "period")
    @NotBlank
    private val period: Int = 0
}
