package com.basaryargici.data.model

/**
 * Created by İbrahim Başar YARGICI at 13.08.2022
 */
object MockData {

    const val HOST = "127.0.0.1"
    const val PORT = 8080
    private const val PARTICIPANT_BASE_PATH = "static/participant"
    private const val LINKEDIN_BASE_PATH = "https://www.linkedin.com/company"

    val participants = listOf(
        Participant("I. Başar Yargıcı", "basar@gmail.com", "$PARTICIPANT_BASE_PATH/participantImage.png"),
        Participant("James Gosling", "james@gmail.com", "$PARTICIPANT_BASE_PATH/participantImage.png"),
        Participant("Robert Martin", "robert@gmail.com", "$PARTICIPANT_BASE_PATH/participantImage.png"),
        Participant("Martin Fowler", "martin@gmail.com", "$PARTICIPANT_BASE_PATH/participantImage.png"),
        Participant("Kent Beck", "kent@gmail.com", "$PARTICIPANT_BASE_PATH/participantImage.png")
    )
    val communities = listOf(
        Community("Turkey Java Community", "static/tjc.jpg", "$LINKEDIN_BASE_PATH/folksdevtv"),
        Community("Folksdev", "static/folksdev.jpg", "$LINKEDIN_BASE_PATH/turkey-java-community"),
    )
}