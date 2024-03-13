package ru.simohin.mayflower.test.integration.upgate.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import ru.simohin.mayflower.test.annotation.NoArg
import ru.simohin.mayflower.test.integration.upgate.enum.ProductType
import java.math.BigDecimal

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@NoArg
data class ProductDto(
    val merchantProductId: String,
    val productPrice: BigDecimal,
    val productName: String,
    val productDescription: String,
    val productId: String? = null,
    val productType: ProductType = ProductType.SALE,
)