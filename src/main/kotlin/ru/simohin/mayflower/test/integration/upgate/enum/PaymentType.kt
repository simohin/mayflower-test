package ru.simohin.mayflower.test.integration.upgate.enum

import com.fasterxml.jackson.annotation.JsonCreator
import ru.simohin.mayflower.test.util.ofValueOrThrow

enum class PaymentType {
    SALE,
    AUTHORIZE,
    MIT_SALE,
    MIT_AUTHORIZE,
    RECURRING;

    companion object {
        @JsonCreator
        @JvmStatic
        fun of(value: String): PaymentType = ofValueOrThrow(value)
    }

}