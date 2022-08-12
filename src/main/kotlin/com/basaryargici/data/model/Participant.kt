package com.basaryargici.data.model

import kotlinx.serialization.Serializable

/**
 * Created by İbrahim Başar YARGICI at 12.08.2022
 */
@Serializable
data class Participant(
    val name: String? = null,
    val mail: String? = null,
    val imageUrl: String? = null
)