package ru.simohin.mayflower.test.integration.upgate.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import ru.simohin.mayflower.test.annotation.NoArg

@NoArg
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class PostbackDto(
    val data: PostbackData
)
