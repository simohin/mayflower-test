package ru.simohin.mayflower.test.integration.upgate.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import ru.simohin.mayflower.test.annotation.NoArg
import ru.simohin.mayflower.test.integration.upgate.enum.PaymentMethod
import ru.simohin.mayflower.test.integration.upgate.enum.PaymentType
import java.math.BigDecimal
import java.time.OffsetDateTime

// Only required fields are used
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@NoArg
data class PaymentDto(
    val paymentId: String,
    val paymentType: PaymentType,
    val paymentMethod: PaymentMethod,
    val merchantId: String,
    val createdAt: OffsetDateTime,
    val merchantPaymentId: String,
    val merchantCustomerId: String,
    val email: String,
    val amount: BigDecimal,
    val language: String,
    val countryCode: String,
    val currencyCode: String,
    val baseAmount: BigDecimal,
    val baseCurrencyCode: String,
    @field:JsonProperty("forced_3d")
    val forced3d: Boolean,
    val successUrl: String,
    val failedUrl: String,
    val shopName: String,
    val session: Session,
    val products: Set<ProductDto>
)
