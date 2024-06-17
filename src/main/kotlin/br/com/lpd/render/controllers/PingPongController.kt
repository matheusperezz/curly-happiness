package br.com.lpd.render.controllers

import br.com.lpd.render.models.PongMessage
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/ping")
class PingPongController {

    @GetMapping
    fun getPing(): String {
        return "Ping"
    }

    @PostMapping
    fun getPong(@RequestBody pong: PongMessage): String {
        val message = pong.message
        return if (message == "Ping") "Pong" else "Seila oque vc mandou"
    }

}