package ru.simohin.mayflower.test.integration.upgate.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import ru.simohin.mayflower.test.integration.upgate.dto.CreatePaymentRequest
import ru.simohin.mayflower.test.integration.upgate.dto.CreatePaymentResponse

@FeignClient(value = "sale", url = "\${integration.upgate.url:https://sandbox.upgate.com/v1}/sale")
interface SaleClient {
    @PostMapping(produces = ["application/json"])
    fun saleRequest(@RequestBody dto: CreatePaymentRequest): CreatePaymentResponse
}