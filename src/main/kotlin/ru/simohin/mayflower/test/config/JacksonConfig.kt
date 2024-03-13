package ru.simohin.mayflower.test.config

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class JacksonConfig {
    @Bean
    @Primary
    fun mapper(): ObjectMapper = ObjectMapper()
        .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
        .disable(
            DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
        )
        .disable(
            SerializationFeature.WRITE_DATES_AS_TIMESTAMPS
        ).registerModules(JavaTimeModule())
}