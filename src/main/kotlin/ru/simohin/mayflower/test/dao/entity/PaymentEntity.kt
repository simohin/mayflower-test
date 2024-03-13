package ru.simohin.mayflower.test.dao.entity

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import ru.simohin.mayflower.test.annotation.NoArg
import ru.simohin.mayflower.test.model.PaymentStatus

@Entity
@NoArg
data class PaymentEntity(
    @Id
    val id: String,
    @Enumerated(EnumType.STRING)
    val status: PaymentStatus
)