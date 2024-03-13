package ru.simohin.mayflower.test.service.product

import org.springframework.stereotype.Service
import ru.simohin.mayflower.test.model.Product
import java.math.BigDecimal
import java.util.*

@Service
class ProductService {

    //    TODO: implement smth, i.e. get products by order id
    fun getProducts() = setOf(
        Product(
            UUID.randomUUID(),
            BigDecimal.TEN,
            "Test product name",
            "Test product description"
        )
    )
}