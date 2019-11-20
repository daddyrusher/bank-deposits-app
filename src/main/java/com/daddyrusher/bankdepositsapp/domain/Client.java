package com.daddyrusher.bankdepositsapp.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank
    private String name;

    @Column
    @NotBlank
    private String shortName;

    @NotBlank
    @Column
    private String address;

    @Column
    @NotBlank
    private String rulesForm;
}
