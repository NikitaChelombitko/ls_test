package leadspace.ua.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Starter

fun main(args: Array<String>) {
    runApplication<Starter>(*args)
}