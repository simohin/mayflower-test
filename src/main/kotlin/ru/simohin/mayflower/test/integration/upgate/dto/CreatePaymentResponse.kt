package ru.simohin.mayflower.test.integration.upgate.dto

import ru.simohin.mayflower.test.annotation.NoArg
import ru.simohin.mayflower.test.integration.upgate.enum.ResponseDataType

@NoArg
data class CreatePaymentResponse(
    val type: ResponseDataType,
    val data: PaymentDto
)
