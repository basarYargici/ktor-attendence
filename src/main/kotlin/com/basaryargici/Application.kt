package com.basaryargici

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.basaryargici.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        configureSerialization()
        configureTemplating()
        configureMonitoring()
        configureSecurity()
        configureRouting()
    }.start(wait = true)
}
