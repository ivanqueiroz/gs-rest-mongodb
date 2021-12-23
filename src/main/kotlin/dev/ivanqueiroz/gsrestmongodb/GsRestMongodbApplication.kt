package dev.ivanqueiroz.gsrestmongodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GsRestMongodbApplication

fun main(args: Array<String>) {
    runApplication<GsRestMongodbApplication>(*args)
}
