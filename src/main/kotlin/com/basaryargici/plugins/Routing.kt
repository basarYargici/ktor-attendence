package com.basaryargici.plugins

import com.basaryargici.routes.getParticipantList
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        getParticipantList()
        get("/") {
            call.respondText("Hello World!")
        }
        static {
            resources("static")
        }
    }
}
