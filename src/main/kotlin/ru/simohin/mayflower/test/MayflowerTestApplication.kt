package ru.simohin.mayflower.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class MayflowerTestApplication

fun main(args: Array<String>) {
    runApplication<MayflowerTestApplication>(*args)
}
