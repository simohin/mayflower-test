package ru.simohin.mayflower.test.service.customer

import org.springframework.stereotype.Service
import ru.simohin.mayflower.test.model.Customer

@Service
class CustomerService {

    //    TODO: implement smth, i.e. get user from auth
    fun getCustomer() = Customer(
        "john_doe@upgate.com"
    )
}