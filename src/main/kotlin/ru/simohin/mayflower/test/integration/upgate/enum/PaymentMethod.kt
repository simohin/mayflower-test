package ru.simohin.mayflower.test.integration.upgate.enum

import com.fasterxml.jackson.annotation.JsonCreator
import ru.simohin.mayflower.test.util.ofValueOrThrow

enum class PaymentMethod {
    CARD,
    ALIPAY,
    ATM_UNION,
    EPS,
    SOFORT,
    GIROPAY,
    SEPA,
    IDEAL,
    UPI,
    CRYPTO;

    companion object {
        @JsonCreator
        @JvmStatic
        fun of(value: String): PaymentMethod = ofValueOrThrow(value)
    }
}