package edu.renatafraga.kotlincircuitbreaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCircuitBreakerApplication

fun main(args: Array<String>) {
	runApplication<KotlinCircuitBreakerApplication>(*args)
}
