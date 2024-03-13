package ru.simohin.mayflower.test.model

import java.math.BigDecimal
import java.util.*

data class Payment(
    val customer: Customer,
    val products: Set<Product>,
    val status: PaymentStatus = PaymentStatus.PENDING,
    val amount: BigDecimal = products.map { it.price }.reduce { first, second -> first.add(second) },
    val id: UUID = UUID.randomUUID()
)