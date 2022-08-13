package com.basaryargici.routes

import com.basaryargici.data.model.MockData
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

/**
 * Created by İbrahim Başar YARGICI at 12.08.2022
 */
fun Route.getParticipantList() {
    get("/participant") {
        call.respond(
            HttpStatusCode.OK,
            MockData.participants
        )
    }
}