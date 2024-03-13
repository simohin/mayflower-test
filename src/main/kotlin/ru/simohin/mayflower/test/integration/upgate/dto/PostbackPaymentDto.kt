package ru.simohin.mayflower.test.integration.upgate.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import ru.simohin.mayflower.test.annotation.NoArg

// Only required fields are used
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@NoArg
data class PostbackPaymentDto(
    val merchantPaymentId: String
)
