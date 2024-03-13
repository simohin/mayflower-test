package ru.simohin.mayflower.test.integration.upgate.enum

import com.fasterxml.jackson.annotation.JsonCreator
import ru.simohin.mayflower.test.util.ofValueOrThrow

enum class ProductType {
    SALE;

    companion object {
        @JsonCreator
        @JvmStatic
        fun of(value: String): ProductType = ofValueOrThrow(value)
    }
}