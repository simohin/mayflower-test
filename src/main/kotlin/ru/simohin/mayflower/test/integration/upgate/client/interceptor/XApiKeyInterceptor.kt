package ru.simohin.mayflower.test.integration.upgate.client.interceptor

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class XApiKeyInterceptor(
    @Value("\${integration.upgate.key:key}")
    private val value: String
) : RequestInterceptor {
    override fun apply(template: RequestTemplate) {
        template.header("X-Api-Key", value)
    }
}