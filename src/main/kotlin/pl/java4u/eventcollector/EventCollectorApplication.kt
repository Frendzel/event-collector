package pl.java4u.eventcollector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventCollectorApplication

fun main(args: Array<String>) {
	runApplication<EventCollectorApplication>(*args)
}

