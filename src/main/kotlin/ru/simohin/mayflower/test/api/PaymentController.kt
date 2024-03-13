package ru.simohin.mayflower.test.api

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.simohin.mayflower.test.model.PaymentResult
import ru.simohin.mayflower.test.service.payment.PaymentService

@RestController
@RequestMapping("payment")
class PaymentController(
    private val paymentService: PaymentService
) {
    @PostMapping
    fun getRedirectUrl(): PaymentResult = paymentService.process()
}