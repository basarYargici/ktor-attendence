package com.basaryargici.plugins

import com.basaryargici.routes.getHomePage
import com.basaryargici.routes.getParticipantList
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        getParticipantList()
        getHomePage()
        static("/static") {
            resources("files")
        }
    }
}
