package ru.simohin.mayflower.test.integration.upgate.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import ru.simohin.mayflower.test.annotation.NoArg
import java.time.OffsetDateTime

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@NoArg
data class Session(
    val createdAt: OffsetDateTime,
    val expiresAt: OffsetDateTime,
    val redirectUrl: String
)