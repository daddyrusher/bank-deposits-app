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

    @Column(name = "client")
    @NotBlank
    private Client client;

    @Column(name = "bank")
    @NotBlank
    private Bank bank;

    @Column(name = "start_date")
    @NotBlank
    private LocalDateTime startDate;

    @Column(name = "percent")
    @NotBlank
    private Double percent;

    @Column(name = "months")
    @NotBlank
    private Integer months;
}
