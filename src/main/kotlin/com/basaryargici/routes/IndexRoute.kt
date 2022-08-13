package com.basaryargici.routes

import com.basaryargici.data.model.MockData
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

/**
 * Created by İbrahim Başar YARGICI at 12.08.2022
 */
fun Route.getHomePage() {
    get("/index") {
        call.respond(
            FreeMarkerContent(
                "index.ftl", mapOf(
                    "users" to MockData.participants,
                    "communities" to MockData.communities,
                )
            )
        )
    }
}