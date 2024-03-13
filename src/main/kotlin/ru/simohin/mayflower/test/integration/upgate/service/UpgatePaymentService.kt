package ru.simohin.mayflower.test.integration.upgate.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import ru.simohin.mayflower.test.integration.upgate.client.SaleClient
import ru.simohin.mayflower.test.integration.upgate.dto.CreatePaymentRequest
import ru.simohin.mayflower.test.integration.upgate.dto.ProductDto
import ru.simohin.mayflower.test.integration.upgate.enum.PaymentMethod
import ru.simohin.mayflower.test.model.Payment
import ru.simohin.mayflower.test.service.payment.PaymentIntegrationService

private val DEFAULT_COUNTRY_CODE = "US"
private val DEFAULT_CURRENCY = "USD"

@Service
class UpgatePaymentService(
    private val client: SaleClient,
    @Value("\${payment.url.base}")
    private val base: String,
    @Value("\${payment.url.success}")
    private val successUrl: String,
    @Value("\${payment.url.failure}")
    private val failureUrl: String
) : PaymentIntegrationService {

    override fun getRedirectUrl(payment: Payment): String =
        CreatePaymentRequest(
            PaymentMethod.CARD,
            payment.id,
            payment.customer.id,
            payment.amount,
            payment.customer.email,
            DEFAULT_COUNTRY_CODE,
            DEFAULT_CURRENCY,
            base + successUrl,
            base + failureUrl,
            payment.products.map {
                ProductDto(
                    it.id.toString(),
                    it.price,
                    it.name,
                    it.description
                )
            }
        ).let {
            client.saleRequest(it).data.session.redirectUrl
        }
}