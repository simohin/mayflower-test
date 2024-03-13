package ru.simohin.mayflower.test.model

import java.math.BigDecimal
import java.util.*

data class Product(
    val id: UUID,
    val price: BigDecimal,
    val name: String,
    val description: String
)
