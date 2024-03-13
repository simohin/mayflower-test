package ru.simohin.mayflower.test.integration.upgate.dto

import ru.simohin.mayflower.test.integration.upgate.enum.PaymentMethod
import java.math.BigDecimal
import java.util.*

// Only required fields are used
data class CreatePaymentRequest(
    val paymentMethod: PaymentMethod,
    val merchantPaymentId: UUID,
    val merchantCustomerId: UUID,
    val amount: BigDecimal,
    val email: String,
    val countryCode: String,
    val currencyCode: String,
    val successUrl: String,
    val failureUrl: String,
    val products: List<ProductDto>
)
