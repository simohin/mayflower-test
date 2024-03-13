package ru.simohin.mayflower.test.service.payment

import org.springframework.stereotype.Service
import ru.simohin.mayflower.test.dao.PaymentDaoService
import ru.simohin.mayflower.test.model.Payment
import ru.simohin.mayflower.test.model.PaymentResult
import ru.simohin.mayflower.test.model.PaymentStatus
import ru.simohin.mayflower.test.service.customer.CustomerService
import ru.simohin.mayflower.test.service.product.ProductService
import java.util.*

@Service
class PaymentService(
    private val paymentIntegrationService: PaymentIntegrationService,
    private val customerService: CustomerService,
    private val productService: ProductService,
    private val paymentDaoService: PaymentDaoService
) {

    fun process(): PaymentResult {
        val customer = customerService.getCustomer()
        val products = productService.getProducts()

        val payment = Payment(customer, products)

        paymentDaoService.save(payment)

        return PaymentResult(payment.id, paymentIntegrationService.getRedirectUrl(payment))
    }

    fun setStatus(merchantPaymentId: UUID, status: PaymentStatus) {
        paymentDaoService.setStatus(merchantPaymentId, status)
    }

}