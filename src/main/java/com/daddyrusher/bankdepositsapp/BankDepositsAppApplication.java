package com.daddyrusher.bankdepositsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@EntityScan(basePackages = {"com.daddyrusher.bankdepositsapp.domain"})
public class BankDepositsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankDepositsAppApplication.class, args);
    }

}
