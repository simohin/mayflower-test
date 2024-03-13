package ru.simohin.mayflower.test.mvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MvcController {

    @GetMapping
    fun handle(): String {
        return "index"
    }

    @GetMapping("\${payment.url.success}")
    fun success(): String {
        return "success"
    }

    @GetMapping("\${payment.url.failure}")
    fun failure(): String {
        return "failure"
    }
}