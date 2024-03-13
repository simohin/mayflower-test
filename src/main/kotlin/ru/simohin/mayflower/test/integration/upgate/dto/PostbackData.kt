package ru.simohin.mayflower.test.integration.upgate.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import ru.simohin.mayflower.test.annotation.NoArg
import ru.simohin.mayflower.test.integration.upgate.enum.TransactionStatus

@NoArg
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
data class PostbackData(
    val transactionStatus: TransactionStatus,
    val payment: PostbackPaymentDto
)