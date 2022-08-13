package com.basaryargici

import com.basaryargici.data.model.MockData.HOST
import com.basaryargici.data.model.MockData.PORT
import com.basaryargici.plugins.configureMonitoring
import com.basaryargici.plugins.configureRouting
import com.basaryargici.plugins.configureSerialization
import freemarker.cache.ClassTemplateLoader
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.freemarker.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = PORT, host = HOST) {
        install(FreeMarker) {
            templateLoader = ClassTemplateLoader(this::class.java.classLoader, "files/templates")
        }
        configureSerialization()
        configureMonitoring()
        configureRouting()
    }.start(wait = true)
}
