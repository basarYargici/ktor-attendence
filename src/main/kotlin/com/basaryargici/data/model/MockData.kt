package com.basaryargici.data.model

/**
 * Created by İbrahim Başar YARGICI at 13.08.2022
 */
object MockData {
    private const val BASE_URL = "http://127.0.0.1:8080"

    val PARTICIPANTS = listOf(
        Participant("I. Başar Yargıcı", "basar@gmail.com", "$BASE_URL/participant/1.png"),
        Participant("James Gosling", "james@gmail.com", "$BASE_URL/participant/1.png"),
        Participant("Robert Martin", "robert@gmail.com", "$BASE_URL/participant/1.png"),
        Participant("Martin Fowler", "martin@gmail.com", "$BASE_URL/participant/1.png"),
        Participant("Kent Beck", "kent@gmail.com", "$BASE_URL/participant/1.png")
    )
}