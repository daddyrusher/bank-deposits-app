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

    @Column(name = "name")
    @NotBlank
    private String name;

    @Column(name = "short_name")
    @NotBlank
    private String shortName;

    @NotBlank
    @Column(name = "address")
    private String address;

    @Column(name = "rules_form")
    @NotBlank
    private String rulesForm;
}
