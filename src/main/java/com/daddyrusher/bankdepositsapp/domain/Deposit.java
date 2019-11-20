package com.daddyrusher.bankdepositsapp.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "deposits")
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @NotBlank
    private Client client;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    @NotBlank
    private Bank bank;

    @Column(name = "start_date")
    @NotBlank
    private LocalDateTime startDate;

    @Column(name = "percent")
    @NotBlank
    private Double percent;

    @Column(name = "period")
    @NotBlank
    private Integer period;
}
