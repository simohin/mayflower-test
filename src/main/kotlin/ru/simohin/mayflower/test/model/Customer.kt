package ru.simohin.mayflower.test.model

import java.util.*

data class Customer(
    val email: String,
    val id: UUID = UUID.randomUUID(),
)