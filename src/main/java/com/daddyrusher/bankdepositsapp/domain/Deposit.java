package com.daddyrusher.bankdepositsapp.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Deposit {
    private Account account;
    private Bank bank;
    private LocalDateTime startDate;
    private Double percent;
    private Integer months;
}
