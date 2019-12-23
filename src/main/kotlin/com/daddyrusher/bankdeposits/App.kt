package com.daddyrusher.bankdeposits;

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan(basePackages = ["com.daddyrusher.bankdeposits.domain"])
class App

fun main(args: Array<String>) { runApplication<App>(*args) }
