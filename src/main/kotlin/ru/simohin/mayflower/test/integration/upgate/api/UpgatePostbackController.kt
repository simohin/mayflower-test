package ru.simohin.mayflower.test.integration.upgate.api

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.simohin.mayflower.test.integration.upgate.dto.PostbackDto
import ru.simohin.mayflower.test.integration.upgate.enum.TransactionStatus
import ru.simohin.mayflower.test.model.PaymentStatus
import ru.simohin.mayflower.test.service.payment.PaymentService
import java.util.*

@RestController
@RequestMapping("upgate/postback")
class UpgatePostbackController(
    private val paymentService: PaymentService
) {

    @PostMapping
    fun update(@RequestBody payload: PostbackDto) {
        paymentService.setStatus(
            UUID.fromString(payload.data.payment.merchantPaymentId),
            when (payload.data.transactionStatus) {
                TransactionStatus.SUCCESS -> PaymentStatus.SUCCESS
                TransactionStatus.DECLINE, TransactionStatus.ERROR -> PaymentStatus.DECLINE
            }
        )
    }
}