package ru.simohin.mayflower.test.service.payment

import ru.simohin.mayflower.test.model.Payment

interface PaymentIntegrationService {
    fun getRedirectUrl(payment: Payment): String
}