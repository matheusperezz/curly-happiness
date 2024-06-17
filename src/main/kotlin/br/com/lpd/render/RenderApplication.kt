package br.com.lpd.render

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RenderApplication

fun main(args: Array<String>) {
    runApplication<RenderApplication>(*args)
}
