package ru.simohin.mayflower.test.model

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.*

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class PaymentResult(
    val paymentId: UUID,
    val redirectUrl: String
)
